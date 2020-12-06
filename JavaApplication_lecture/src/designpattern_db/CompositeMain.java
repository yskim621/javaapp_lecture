package designpattern_db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//파일과 디렉토리의 작업을 위한 인터페이스
interface Entry {
	void add(Entry entry);

	void remove();

	void rename(String name);
}

class File implements Entry {
	private String name;

	public File(String name) {
		this.name = name;
	}
	@Override
	public void add(Entry entry) {
		throw new UnsupportedOperationException();
	}
	@Override
	public void remove() {
		System.out.println(this.name + "를 삭제했다.");
	}
	@Override
	public void rename(String name) {
		this.name = name;
	}
}



class Directory implements Entry {
	private String name;

	private List<Entry> list;

	public Directory(String name) {
		this.name = name;
		this.list = new ArrayList<>();
	}

	@Override
	public void add(Entry entry) {
		list.add(entry);
	}
	@Override
	public void remove() {
		Iterator<Entry> itr = list.iterator();
		while (itr.hasNext()) {
			Entry entry = itr.next();
			entry.remove();
		}
		System.out.println(this.name + "을 삭제했다.");
	}

	@Override
	public void rename(String name) {
		this.name = name;
	}
}

public class CompositeMain {
	public static void main(String... args) {
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file3");
		File file4 = new File("file4");

		Directory dir1 = new Directory("dir1");
		dir1.add(file1);

		Directory dir2 = new Directory("dir2");
		dir2.add(file2);
		dir2.add(file3);

		dir1.add(dir2);
		dir1.add(file4);
		dir1.remove();
	}
}
