package toolbox.db;

public interface IDBFactory {

	public IDBManager dbManagerFactory();

	public default IDBManager create() {
		IDBManager dbM = dbManagerFactory();
		return dbM;
	}

}
