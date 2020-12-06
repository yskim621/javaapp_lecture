package guiprogramming;

import java.awt.*;
class Checkbox1 extends Frame {
	public Checkbox1(String str){
		super(str);
		Panel p = new Panel();
		Checkbox cbx1=new Checkbox("이대",true);
		Checkbox cbx2=new Checkbox("강남");	
		Checkbox cbx3=new Checkbox("종로");
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("이대",group,true);
		Checkbox cbx5=new Checkbox("강남",group,false);	
		Checkbox cbx6=new Checkbox("종로",group,false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);

		add(p);
		setSize(180, 300);
		setVisible(true);
	}
}

public class CheckBoxMain {
	public static void main(String[] args) 
	{
		new Checkbox1("체크 박스 테스트");
	}

}
