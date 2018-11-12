package toolbox.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessImpl implements IAccess {

	private ResultSet resultSet = null;
	private Statement statement = null;
	private Connection cnnct = null;
	private PreparedStatement pstmt = null;

	@Override
	public boolean connectDB(ConnectBean bean) {

		try {
			Class.forName(bean.getCnnectString()).newInstance();

			cnnct = DriverManager.getConnection(bean.getDbPath(), bean.getProps());
			cnnct.setAutoCommit(false);

			statement = cnnct.createStatement();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean closeDB() {
		return false;
	}

}
