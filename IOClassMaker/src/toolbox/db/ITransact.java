package toolbox.db;

public interface ITransact {

	public boolean commit();

	public boolean rollBack();

}
