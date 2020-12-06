package guiprogramming;

import java.awt.*;
class ModelessDialog extends Frame
{
	static final long serialVersionUID = 1;
	public ModelessDialog()
	{
		super("다이얼로그 테스트");
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		setBounds(0,0, 400, 400);
		setVisible(true);
		d.setSize(200,200);
		d.setVisible(true);
	}
}