package toolbox.db;

public class Test {


	public Test() {

		IDBFactory factory = new DBFactoryImpl();
		IDBManager dbM = factory.dbManagerFactory();


	}
}
