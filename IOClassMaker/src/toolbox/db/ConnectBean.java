package toolbox.db;

import java.util.Properties;

public class ConnectBean implements IConnectBean {

	private String cnnectString = null;
	private String userID = null;
	private String password = null;
	private String dbPath = null;

	private static Properties props = null;

	public ConnectBean() {
		props = new Properties();
	}

	public String getCnnectString() {
		return cnnectString;
	}

	public void setCnnectString(String cnnectString) {
		this.cnnectString = cnnectString;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
		props.setProperty("user", userID);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		props.setProperty("password", password);
	}

	public String getDbPath() {
		return dbPath;
	}

	public void setDbPath(String dbPath) {
		this.dbPath = dbPath;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		ConnectBean.props = props;
	}

}
