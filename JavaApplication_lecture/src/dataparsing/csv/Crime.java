package dataparsing.csv;

public class Crime {
	private String num;
	private int murder;
	private int robber;
	private int sexCrime;
	private int theft;
	private int violence;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getMurder() {
		return murder;
	}

	public void setMurder(int murder) {
		this.murder = murder;
	}

	public int getRobber() {
		return robber;
	}

	public void setRobber(int robber) {
		this.robber = robber;
	}

	public int getSexCrime() {
		return sexCrime;
	}

	public void setSexCrime(int sexCrime) {
		this.sexCrime = sexCrime;
	}

	public int getTheft() {
		return theft;
	}

	public void setTheft(int theft) {
		this.theft = theft;
	}

	public int getViolence() {
		return violence;
	}

	public void setViolence(int violence) {
		this.violence = violence;
	}

	@Override
	public String toString() {
		return "Crime [num=" + num + ", murder=" + murder + ", robber=" + robber + ", sexCrime=" + sexCrime + ", theft="
				+ theft + ", violence=" + violence + "]";
	}

}
