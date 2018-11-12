package toolbox.db;

public interface IAccess {

	public boolean connectDB(ConnectBean bean);

	public boolean closeDB();

}
