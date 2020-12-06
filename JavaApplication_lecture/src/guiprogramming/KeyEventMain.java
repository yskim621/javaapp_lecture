package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class KeyEventTest extends Frame implements KeyListener {
	TextArea txt_info;
	TextField txt;

	public KeyEventTest(String str) {
		super(str);
		txt = new TextField();
		txt.addKeyListener(this);
		add("Center", txt_info = new TextArea());
		add("South", txt);
		setSize(300, 200);
		setVisible(true);
	}

	public void keyTyped(KeyEvent e) {
		txt_info.setText(e.getKeyChar() + "가 입력되었습니다.\n");
	}

	public void keyPressed(KeyEvent e) {
		txt_info.setText(e.getKeyChar() + "가 눌렸습니다.\n");
	}

	public void keyReleased(KeyEvent e) {
		txt_info.setText(e.getKeyChar() + "를 놓았습니다.\n");
	}
}

public class KeyEventMain {
	public static void main(String[] args) {
		new KeyEventTest("KeyEvent 예제");
	}

}
