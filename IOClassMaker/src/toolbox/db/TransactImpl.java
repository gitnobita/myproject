package toolbox.db;

public class TransactImpl implements ITransact {

	@Override
	public boolean commit() {
		return false;
	}

	@Override
	public boolean rollBack() {
		return false;
	}

}
