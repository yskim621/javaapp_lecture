package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class ActionEvent2 extends Frame implements ActionListener {
	Label lbl;
	Button btn1, btn2, btn3;

	public ActionEvent2(String str) {
		super(str);
		lbl = new Label("버튼을 선택하세요.");
		btn1 = new Button("☆ 버튼");
		btn2 = new Button("★ 버튼");
		btn3 = new Button("종료");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		add("Center", panel);
		add("South", lbl);
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if ((Button) obj == btn1) {
			lbl.setText("☆ 버튼을 눌렀습니다.");
		} else if ((Button) obj == btn2) {
			lbl.setText(" ★버튼을 눌렀습니다.");
		} else if ((Button) obj == btn3) {
			lbl.setText("프로그램을 종료합니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e1) {
			}
			System.exit(0);
		}

	}
}

public class EventRoutingMain {
	public static void main(String[] args) {
		new ActionEvent2("이벤트 라우팅");
	}
}
