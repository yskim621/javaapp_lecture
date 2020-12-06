package guiprogramming;

import java.awt.*;

class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;

	public LabelTest(String str) {
		super(str);
		p = new Panel();
		label1 = new Label("이대");
		label2 = new Label("강남", Label.CENTER);
		label3 = new Label("종로", Label.LEFT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1);
		p.add(label2);
		p.add(label3);
		add(p);
		setSize(300, 300);
		setVisible(true);
	}
}

public class LabelMain {
	public static void main(String[] args) {
		new LabelTest("레이블 테스트");
	}
}
