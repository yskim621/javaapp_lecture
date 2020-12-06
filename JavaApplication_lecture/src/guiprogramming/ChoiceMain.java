package guiprogramming;

import java.awt.* ;
class ChoiceTest extends Frame 
{
	Choice ch;
	public ChoiceTest(String str)
	{
		super(str);
		ch= new Choice();
		ch.addItem("이대");
		ch.addItem("강남");
		ch.addItem("종로");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}

public class ChoiceMain {
	public static void main(String[] args) 
	{
		new ChoiceTest("콤보 박스 연습");
	}
}
