package usefulapi;

class Tape
{
	static int number;
	static { number = 0;} 
	public int tapenumber;
	public String title;
	public Tape(String str)
	{
		tapenumber = ++number;
		title = str;
	}
	public String toString(){
		return String.format("%5d %10s",tapenumber,title);
	}
}
