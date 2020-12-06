package designpattern_db;

interface DB{
	public void disp();
}

class OracleDB implements DB {
	@Override
	public void disp() {
		System.out.println("Oracle Database");
	}
}

class MySQLDB implements DB{
	@Override
	public void disp() {
		System.out.println("MySQL Database");
	}
}

class RDBMSFactory{
	public static DB dbFactory(String env) {
		switch(env) {
			case "Oracle":
				return new OracleDB();
			case "MySQL":
				return new MySQLDB();
			default:
				return	null;
		}
	}
}

public class FactoryMain {
	public static void main(String[] args) {
		DB db = RDBMSFactory.dbFactory("Oracle");
		db.disp();
	}
}
