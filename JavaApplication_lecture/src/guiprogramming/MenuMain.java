package guiprogramming;

import java.awt.*;

class MenuTest extends Frame {
	public MenuTest(String str) {
		super(str);
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		MenuItem file_new = new MenuItem("새로 만들기");
		MenuItem file_open = new MenuItem("열기");
		MenuItem file_save = new MenuItem("저장");
		MenuItem file_newname = new MenuItem("저장");

		file.add(file_new);
		file.add(file_open);
		file.add(file_save);
		file.add(file_newname);

		Menu edit = new Menu("편집");
		MenuItem edit_undo = new MenuItem("실행취소");
		MenuItem edit_cut = new MenuItem("잘라내기");
		MenuItem edit_copy = new MenuItem("복사");
		MenuItem edit_paste = new MenuItem("붙여넣기");
		edit.add(edit_undo);
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);

		Menu view = new Menu("보기");
		CheckboxMenuItem view_status = new CheckboxMenuItem("상태표시줄");
		view.add(view_status);

		mb.add(file);
		mb.add(edit);
		mb.add(view);

		setMenuBar(mb);
		setSize(200, 200);
		setVisible(true);
	}
}

public class MenuMain{
	public static void main(String[] args) {
		new MenuTest("메뉴 테스트");
	}
}