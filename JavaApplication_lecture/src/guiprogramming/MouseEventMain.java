package guiprogramming;
import java.awt.*;
import java.awt.event.*;

class MoustEventView extends Frame implements MouseListener {
	public MoustEventView(String str) {
		super(str);
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("누름");
	}

	

	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스업");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 윈도우 영역 안으로 들어옴");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 윈도우 영역을 벗어남");
	}
}

public class MouseEventMain {
	public static void main(String[] args) {
		new MoustEventView("마우스 이벤트 테스트");
	}

}
