package designpattern_db;
class PrevSystem {
	public void prevProcess() {
		System.out.println("예전 처리 내용");
	}
}

interface PrevTarget {
	void process();
}

class Adapter extends PrevSystem implements PrevTarget {
	@Override
	public void process() {
		prevProcess();
	}
}

public class AdapterMain {
	public static void main(String[] args) {
		PrevTarget target = new Adapter();
		target.process();
	}
}
