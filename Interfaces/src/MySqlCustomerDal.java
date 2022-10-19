
public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		
		System.out.println("my Sql Eklendi");
		
	}

	@Override
	public void birsey() {
		System.out.println("bir şey yaptı");
		
	}

}
