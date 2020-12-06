package guiprogramming;
import java.awt.* ;

class TextAreaTest extends Frame {
	public TextAreaTest(String str){
  		super(str);
		Panel p = new Panel();
		TextArea txt1 = new TextArea(10,30);
		TextField txt2 = new TextField("Hello Java",20);	
		txt1.setText("  Java World ");
  		txt1.setBackground(Color.yellow);
  		txt1.setFont(new Font("궁서체",Font.BOLD, 10));
  		txt1.setForeground(Color.blue);
  		txt2.setEchoChar('@');
  		txt2.setForeground(Color.red);
  		p.add(txt1); 
  		p.add(txt2);  	
		add(p);
  		setSize(200,200);
  		setVisible(true);  	
	}
}

public class TextAreaMain {
	public static void main(String[] args) {
		new TextAreaTest("Text 테스트");
	}

}

