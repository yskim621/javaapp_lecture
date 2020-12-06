package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class TextEventView extends Frame implements TextListener {
	TextField txt;
	Label lbl;

	public TextEventView(String str) {
		super(str);
		txt = new TextField("텍스트를 입력하세요.", 20);
		txt.addTextListener(this);
		lbl = new Label("");
		add("Center", lbl);
		add("South", txt);
		setSize(300, 200);
		setVisible(true);
	}

	public void textValueChanged(TextEvent e) {
		lbl.setText(txt.getText());
	}
}

public class TextEventMain {
	public static void main(String[] args) {
		new TextEventView("텍스트 이벤트");
	}
}
