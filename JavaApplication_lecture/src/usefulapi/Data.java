package usefulapi;

class Data implements Comparable<Data> {
	private String name;
	private int jumsu;
	public Data() {
		super();
		name = "noname";
	}
	public Data(String name, int jumsu) {
		super();
		this.name = name;
		this.jumsu = jumsu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public int compareTo(Data obj) {
		if (this.jumsu > obj.jumsu)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", jumsu=" + jumsu + "]";
	}
}

