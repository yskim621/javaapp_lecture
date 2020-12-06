package guiprogramming;
import java.awt.* ;
class TextFieldTest extends Frame 
{
	public TextFieldTest(String str)	
	{
		super(str);
		Panel p = new Panel();
		Label lbl1 = new Label(" 아 이 디:");  	
		Label lbl2 = new Label(" 비밀번호:");  	
		TextField txt1 = new TextField("ID", 20 );
		TextField txt2 = new TextField(20);
		txt2.setEchoChar('*');
		p.add(lbl1);
		p.add(txt1);
		p.add(lbl2);  
		p.add(txt2);
		add(p);
		setSize(200,200);
		setVisible(true);  	
	}
}

public class TextFieldMain {
	public static void main(String[] args) {
		new TextFieldTest("TextField 테스트");
	}
}

