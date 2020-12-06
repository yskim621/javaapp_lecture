package guiprogramming;

import java.awt.*;

class CanvasTest {
	public static void main(String args[]) {
		Frame f = new Frame("CanvasTest");
		f.setSize(300, 200);
		Canvas c = new Canvas();
		c.setBackground(Color.pink);

		f.add(c);
		f.setVisible(true);
	}
}

