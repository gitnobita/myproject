package toolbox.db;

import java.util.List;

public class DBManagerImpl implements IDBManager{

	private IAccess access;
	private IExecute execute;
	private ITransact transact;

	@Override
	public boolean connectDB(ConnectBean bean) {
		return access.connectDB(bean);
	}

	@Override
	public boolean closeDB() {
		return access.closeDB();
	}

	@Override
	public <T> List<T> getResultList(String sql, Class<T> resultClass) {
		return execute.getResultList(sql, resultClass);
	}

	@Override
	public int execute(String sql) {
		return execute.execute(sql);
	}

	@Override
	public boolean commit() {
		return transact.commit();
	}

	@Override
	public boolean rollBack() {
		return transact.rollBack();
	}

	public IAccess getAssess() {
		return access;
	}

	@Override
	public void setIAccess(IAccess access) {
		this.access = access;
	}

	public IExecute getExecute() {
		return execute;
	}

	@Override
	public void setIExecute(IExecute execute) {
		this.execute = execute;
	}

	public ITransact getTransact() {
		return transact;
	}

	@Override
	public void setITransact(ITransact transact) {
		this.transact = transact;
	}



}
