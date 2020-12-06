package practice.chap11;

public class Data {
	private int num;
	private String name;
	private String phone;
	private String address;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data(int num, String name, String phone, String address) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
}
