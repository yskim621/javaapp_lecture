package java.lang;

enum TelecomCompany {
	 SKT("011"), KT("016"), LGT("019"), Other("MVNO");
	 String number;
	 TelecomCompany(String num){
		 number = num;
	 }
	 
	 public String getNumber(){
		 return number;
	 }
}

public class Enum1{
	 public static void main(String args[]){
		 TelecomCompany t = TelecomCompany.SKT;
		 System.out.println("t의 번호:" + t.getNumber());
		 
		 TelecomCompany [] mobile = TelecomCompany.values();
			for(TelecomCompany m : mobile){
				System.out.println(m + ":" + m.ordinal());
			}
	 }
}

