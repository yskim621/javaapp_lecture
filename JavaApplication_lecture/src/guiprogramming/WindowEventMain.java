package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class WindowEventView extends Frame implements WindowListener {
	public WindowEventView(String str) {
		super(str);
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("윈도우 열기");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("윈도우 최소화");
	}
	
	public void windowActivated(WindowEvent e) {
		System.out.println("윈도우 활성화");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("윈도우 비활성화");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("윈도우 아이콘화");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈도우 아이콘 해제");
	}
}

public class WindowEventMain {
	public static void main(String[] args) {
		new WindowEventView("윈도우 이벤트");
	}

}
