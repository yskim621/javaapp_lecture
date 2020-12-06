package guiprogramming;

import java.awt.*;
import java.awt.event.*;
class ActionEvent1 extends Frame implements ActionListener 
{ 
	Label lbl;
	Button btn;
	public ActionEvent1(String str) 
	{
		super(str);        
		lbl = new Label("버튼을 누르세요");
		btn = new Button("☆ 버튼");
		btn.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn);
		add("Center", panel);
		add("South", lbl);
		setSize(300,200);
		setVisible(true);
	}
    public void actionPerformed(ActionEvent e) 
	{
		lbl.setText("☆ 버튼을 눌렀습니다.");
	}
}
public class ActionEventMain {
	public static void main(String[] args) {
		new ActionEvent1("ActionEvent 테스트");
	}
}

