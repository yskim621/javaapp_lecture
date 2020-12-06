package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class KeyMove extends Frame implements KeyListener {
	Label label = new Label("@");
	int x = 100;
	int y = 100;

	public KeyMove() {
		super("KeyEvent 테스트");
		setLayout(null);
		label.setBounds(x, y, 20, 20);
		add(label);
		setBounds(300, 300, 300, 300);
		setVisible(true);
		addKeyListener(this);
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y = y + 5;
			label.setBounds(x, y, 20, 20);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			y = y - 5;
			label.setBounds(x, y, 20, 20);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x = x - 5;
			label.setBounds(x, y, 20, 20);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x = x + 5;
			label.setBounds(x, y, 20, 20);
		}
	}
}

public class KeyMoveMain {
	public static void main(String[] args) {
		new KeyMove();
	}

}
