package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class AdapterView extends Frame {
	Button btn1;
	Button btn2;
	public TextField text;

	public AdapterView() {
		super("Adapter를 이용한 이벤트 처리");
		setLayout(null);
		text = new TextField();
		btn1 = new Button("버튼1");
		btn2 = new Button("버튼2");
		text.setBounds(100, 100, 60, 20);
		btn1.setBounds(110, 130, 40, 20);
		btn2.setBounds(150, 130, 40, 20);
		add(btn1);
		add(btn2);
		add(text);
		btn1.addFocusListener(new FocusHandler(text));
		btn2.addFocusListener(new FocusHandler(text));
		addWindowListener(new WindoEventHandler());
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
}

class FocusHandler extends FocusAdapter {
	TextField text;

	public FocusHandler(TextField tf) {
		text = tf;
	}

	public void focusGained(FocusEvent e) {
		Button obj = (Button) e.getSource();
		text.setText(obj.getLabel() + "포커스를 얻음");
	}
}

class WindoEventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class AdapterEventMain {
	public static void main(String[] args) {
		new AdapterView();
	}

}
