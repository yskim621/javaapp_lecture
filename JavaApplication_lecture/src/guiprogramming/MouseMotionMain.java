package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class MouseMotionEventTest extends Frame implements MouseMotionListener {
	Label lbl;

	public MouseMotionEventTest(String str) {
		super(str);
		lbl = new Label();
		add("North", lbl);
		addMouseMotionListener(this);
		setSize(300, 200);
		setVisible(true);
	}

	public void mouseDragged(MouseEvent e) {
		lbl.setText("마우스 드래그");
	}

	public void mouseMoved(MouseEvent e) {
		lbl.setText("X:" + e.getX() + " Y:" + e.getY());
	}
}

public class MouseMotionMain {
	public static void main(String[] args) {
		new MouseMotionEventTest("마우스 모션 이벤트 테스트");
	}

}
