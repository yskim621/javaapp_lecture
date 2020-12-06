package guiprogramming;

import javax.swing.*;

class JFrameView extends JFrame {
	public JFrameView() {
		super("J프레임");
		setSize(260, 100);
		setVisible(true);
	}
}

public class JFrameMain {
	public static void main(String[] args) 
	{
		JFrameView  f = new JFrameView();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
