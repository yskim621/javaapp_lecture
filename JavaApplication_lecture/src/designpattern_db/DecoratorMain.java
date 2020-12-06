package designpattern_db;

interface Coffee {
	public void make();
	public String getDescription();
}

//단순하게 만들어지는 클래스
class SimpleCoffee implements Coffee {
	public void make() {}
	public String getDescription() {
		return "단순한 커피";
	}
}

//다른 데코레이터를 받아서 만드는 클래스의 추상 클래스
abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
}

//데코레이터 클래스
class SugarCoffeeDecorator extends CoffeeDecorator {
	public SugarCoffeeDecorator(Coffee coffeeDecorator) {
		super(coffeeDecorator);
	}

	@Override
	public void make() {
		this.decoratedCoffee.make();
	}

	public String getDescription() {
		return decoratedCoffee.getDescription() + ", 설탕 추가";
	}
}

//데코레이터 클래스
class CreamCoffeeDecorator extends CoffeeDecorator {
	public CreamCoffeeDecorator(Coffee coffeeDecorator) {
		super(coffeeDecorator);
	}

	@Override
	public void make() {
		this.decoratedCoffee.make();
	}

	public String getDescription() {
		return decoratedCoffee.getDescription() + ", 크림 추가";
	}
}


public class DecoratorMain {
	public static void main(String[] args) {
		//단순 커피에 설탕을 추가하고 크림 커피로 생성
		Coffee myCoffee = new CreamCoffeeDecorator(
				new SugarCoffeeDecorator(new SimpleCoffee()));
		System.out.println(myCoffee.getDescription());
		//단순 커피
		Coffee yourCoffee = new SimpleCoffee();
		System.out.println(yourCoffee.getDescription());
	}
}
