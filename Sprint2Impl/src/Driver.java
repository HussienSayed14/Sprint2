import java.sql.SQLException;


public class Driver extends Users {
	
	private String UserName,Password,License;
	int number,ID;
	public boolean status=false;
	
	
	public boolean ver=false;
	
	
	@Override
	public void Login(String user,String pass) throws SQLException {

		status=false;
		if(ret.DriverLogin(user, pass)==false)
		{
			status=false;
			System.out.println("Login Falied");
		}
		else
			status=true;
		    
		
	
		
	}

	//@Override
	public void Update(int price) {
		System.out.println("A ride with fav area has been made (To driver)");
		
	}
	

	public void RegisterD(String user_name, String password, int phone,String lic,int id) throws SQLException {
		
		
		UserName=user_name;
		Password=password;
		number=phone;
		License=lic;
		ID=id; 
		insert.InsertIntoDriverInfo(user_name, password, phone, lic, id);
		
		
	}

	@Override
	public String getUser() {
		
		return UserName;
	}

	@Override
	public String getPass() {
		return Password;
	}

	@Override
	public boolean getStat() {
		
		return status;
	}

	
	public String getLic()
	{
		return License;
	}
	@Override
	public int getID() 
	{
		return ID;
	}

	@Override
	public void Register(String user_name, String password, int phone) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
