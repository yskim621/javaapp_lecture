package guiprogramming;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class ActionEvent3 extends Frame implements ActionListener {
	TextField text;
	Button btn;
	Choice combo;
	// 중복된 데이터 저장을 막기 위해서 사용
	HashSet<String> hs = new HashSet<String>();

	public ActionEvent3() {
		super("Enter 테스트");
		setLayout(null);
		text = new TextField(20);
		btn = new Button("추가");
		combo = new Choice();
		text.setBounds(100, 100, 60, 20);
		btn.setBounds(170, 100, 40, 20);
		combo.setBounds(100, 130, 100, 40);
		add(btn);
		add(text);

		add(combo);
		text.addActionListener(this);
		btn.addActionListener(this);
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (hs.add(text.getText())) {
			combo.add(text.getText());
		}
		text.setText("");
	}
}

public class ActionEventRouting {
	public static void main(String[] args) {
		new ActionEvent3();
	}

}
