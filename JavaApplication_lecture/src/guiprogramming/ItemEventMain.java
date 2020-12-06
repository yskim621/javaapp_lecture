package guiprogramming;

import java.awt.*;
import java.awt.event.*;

class ItemEventView extends Frame implements ItemListener {
	Choice lst_1, lst_2;
	Label lbl_info;

	String[] group = { "A조", "B조", "C조", "D조", "E조", "F조", "G조", "H조" };
	String[][] national = { { "독일", "에콰도르", "폴란드", "코스타리카" }, { "잉글랜드", "스웨덴", "트리니다드 토바고", "파라과이" },
			{ "코트디부아르", "네델란드", "아르헨티나", "세르비아" }, { "포르투칼", "멕시코", "이란", "앙골라" }, { "이탈리아", "체코", "미국", "가나" },
			{ "브라질", "일본", "호주", "크로아티아" }, { "프랑스", "스위스", "대한민국", "토고" }, { "스페인", "우크라이나", "튀니지", "사우디아라비아" } };

	public ItemEventView(String str) {
		super(str);
		Label lbl = new Label("조와 국가를 선택하세요?");
		Panel panel = new Panel();
		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		for (int i = 0; i < group.length; i++)
			lst_1.add(group[i]);

		lst_2.add("      ");
		panel.add(lst_1);
		panel.add(lst_2);

		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);

		setSize(500, 300);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		Choice obj = (Choice) e.getSource();
		String str = "선택한 조와 나라는 : ";
		if (obj == lst_1) {
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();
			for (int i = 0; i < national[j].length; i++) {
				lst_2.add(national[j][i]);
			}
		} else {
			str += lst_1.getSelectedItem();
			str += "의" + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
	}
}

public class ItemEventMain {
	public static void main(String[] args) {
		new ItemEventView("아이템 이벤트");
	}

}
