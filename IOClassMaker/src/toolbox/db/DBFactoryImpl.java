package toolbox.db;

public class DBFactoryImpl implements IDBFactory {

	@Override
	public IDBManager dbManagerFactory() {
		IDBManager dbM = new DBManagerImpl();

		dbM.setIAccess(new AccessImpl());
		dbM.setIExecute(new ExecuteImpl());
		dbM.setITransact(new TransactImpl());

		return dbM;
	}

}
