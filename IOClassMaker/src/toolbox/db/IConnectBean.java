package toolbox.db;

import java.util.Properties;

public interface IConnectBean {

	public void setUserID(String userID) ;

	public String getPassword() ;

	public void setPassword(String password);

	public String getDbPath() ;

	public void setDbPath(String dbPath);

	public Properties getProps() ;

	public void setProps(Properties props) ;


}
