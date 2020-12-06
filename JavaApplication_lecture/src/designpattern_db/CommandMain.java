package designpattern_db;

class Book {
	private double amount;

	public Book(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

abstract class Command {
	protected Book book;

	public void setBook(Book book) {
		this.book = book;
	}

	public abstract void execute();
}

class DiscountCommand extends Command {
	@Override
	public void execute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.9);
	}
}

class SpecialDiscountCommand extends Command {
	@Override
	public void execute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.7);
	}
}

public class CommandMain {
	public static void main(String... args) {
		// 5000원의 만화책
		Book comic = new Book(5000);

		// 25000원의 기술서적
		Book technicalBook = new Book(25000);

		// 할인 가격 계산용 명령
		Command discountCommand = new DiscountCommand();

		// 특별 할인 가격 계산용 명령
		Command specialDiscountCommand = new SpecialDiscountCommand();

		// 만화책에 할인을 적용
		discountCommand.setBook(comic);
		discountCommand.execute();
		System.out.println("할인 후 금액은 " + comic.getAmount() + "원");

		// 기술서적에 할인을 적용
		discountCommand.setBook(technicalBook);
		discountCommand.execute();
		System.out.println("할인 후 금액은 " + technicalBook.getAmount() + "원");

		// 기술서적에 추가 특별 할인을 적용
		specialDiscountCommand.setBook(technicalBook);
		specialDiscountCommand.execute();
		System.out.println("할인 후 금액은 " + technicalBook.getAmount() + "원");
	}
}
