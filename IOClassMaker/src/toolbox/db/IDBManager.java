package toolbox.db;

public interface IDBManager extends IAccess, IExecute, ITransact {
	public void setIAccess(IAccess access);

	public void setIExecute(IExecute execute);

	public void setITransact(ITransact transact);

}
