import java.sql.SQLException;

public class User extends Users {
	private String UserName,Password;
	int number;
	public boolean status=false;
	
	
	

	//@Override
	public void Register(String user_name,String password,int phone) throws SQLException {
		UserName=user_name;
		Password=password;
		number=phone;
		
		
		insert.InsertIntoUserInfo(user_name, password, phone);		
		
		
	}

	@Override
	public void Login(String user,String pass) throws SQLException {
		
		status=false;
		if(ret.UserLogin(user, pass)==false)
		{
			status=false;
			System.out.println("Login Falied");
		}
		else
			status=true;
		

		}
	
	
	
	public boolean getStat()
	{
		return status;
	}


	//@Override
	public void Update(int price) {
		System.out.println("an offer to your ride is:" + price+" EGP (To User)");
		
	}

	@Override
	public int getID() {
		
		return 1;
	}

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPass() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
