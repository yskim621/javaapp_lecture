package designpattern_db;

import java.util.ArrayList;
import java.util.List;

interface Observer {
	void update(Subject subject);
}

abstract class Subject {
	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public abstract void execute();
}

class Client implements Observer {
	@Override
	public void update(Subject subject) {
		System.out.println("통지를 수신했다.");
	}
}

class DataChanger extends Subject {
	private int status;

	@Override
	public void execute() {
		status++;
		System.out.println("상태가 " + status + "로 바뀌었다.");
		notifyObservers();
	}
}

public class ObserverMain {
	public static void main(String... args) {
		Observer observer = new Client();
		Subject dataChanger = new DataChanger();

		dataChanger.addObserver(observer);
		for (int count = 0; count < 10; count++) {
			dataChanger.execute();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

