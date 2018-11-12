package toolbox.db;

import java.util.List;

public interface IExecute {

	public <T> List<T> getResultList(String sql, Class<T> resultClass);

	public int execute(String sql);

}
