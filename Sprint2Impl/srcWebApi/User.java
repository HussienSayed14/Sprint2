package com.hussien.demot;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
@Path("User")
public class User extends Users {
	private String UserName,Password;
	int number;
	public boolean status=false;
	
	
	

	@POST
	@Path("Register")
	
	public void Register(@QueryParam("Cuser")String user_name,@QueryParam("Pass")String password,@QueryParam("phone")int phone) throws SQLException {
		UserName=user_name;
		Password=password;
		number=phone;
		
		
		insert.InsertIntoUserInfo(user_name, password, phone);		
		
		
	}

	@Override
	@GET
	@Path("/Login")
	public void Login(@QueryParam("Cuser")String user,@QueryParam("Pass")String pass) throws SQLException {
		
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
