package practice.chap06;

public class Account {
	//프로퍼티
	private String accountNumber;
	private String userName;
	private double balance;
	
	//생성자
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.userName = "noname";
		this.balance = 0;
	}

	public Account(String accountNumber, String userName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = balance;
	}

	//접근자 메소드
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void read(String accountNumber) {
		System.out.println(accountNumber + "의 잔액은 " + balance);
	}
	
	public void update(String accountNumber, double money) {
		balance = balance + money;
	}
}
