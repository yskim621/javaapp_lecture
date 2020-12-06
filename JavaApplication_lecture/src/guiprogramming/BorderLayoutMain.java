package guiprogramming;

import java.awt.*;
class BorderLayoutTest extends Frame 
{
	public BorderLayoutTest(String str) 
	{
		super(str);
		setLayout(new BorderLayout());
		add("North", new Button("북쪽"));
		add("West", new Button("서쪽"));
		add("East", new Button("동쪽"));
		add("Center", new Button("중앙"));
		add("South", new Button("남쪽"));

		setSize(200,200);
		setVisible(true);
	}
}

public class BorderLayoutMain{
	public static void main(String[] args) {
		new BorderLayoutTest("BorderLayout 예제");
	}
}
