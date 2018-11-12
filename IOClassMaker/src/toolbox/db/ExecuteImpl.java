package toolbox.db;

import java.util.List;

public class ExecuteImpl implements IExecute {

	@Override
	public <T> List<T> getResultList(String sql, Class<T> resultClass) {
		return null;
	}

	@Override
	public int execute(String sql) {
		return 0;
	}

}
