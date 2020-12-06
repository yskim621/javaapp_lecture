package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class CheckBoxEvent extends Frame implements ItemListener {
	Panel panel;
	Checkbox ckb1, ckb2, ckb3, ckb4;
	TextArea ta;
	Label lbl;

	public CheckBoxEvent(String str) {
		super(str);
		lbl = new Label("좋아하는 언어를 선택하세요");
		ta = new TextArea();
		panel = new Panel();
		ckb1 = new Checkbox("C");
		ckb2 = new Checkbox("C++");
		ckb3 = new Checkbox("Java");
		ckb4 = new Checkbox("C#");

		ckb1.addItemListener(this);
		ckb2.addItemListener(this);
		ckb3.addItemListener(this);
		ckb4.addItemListener(this);
		
		panel.add(ckb1);
		panel.add(ckb2);
		panel.add(ckb3);
		panel.add(ckb4);
		add("North", lbl);
		add("Center", ta);
		add("South", panel);
		setSize(300, 150);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		ta.setText("");
		if (ckb1.getState())
			ta.append("C언어는 하드웨어에 강합니다. \n");
		if (ckb2.getState())
			ta.append("C++는 STL이 훌륭합니다. \n");
		if (ckb3.getState())
			ta.append("Java는 웹과 모바일에 강합니다. \n");
		if (ckb4.getState())
			ta.append("C#은 윈도우 프로그램을 쉽게 만들 수 있습니다. \n");
	}
}

public class CheckBoxEventMain {
	public static void main(String[] args) {
		new CheckBoxEvent("체크박스 테스트");
	}
}