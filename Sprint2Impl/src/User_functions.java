import java.sql.SQLException;



public class User_functions {
	
	Data_Insertions insert = new Data_Insertions();
	 Data_Retrieving retrieve = new Data_Retrieving();
	 Data_Updating update = new Data_Updating();


	 public void ReqRide(String cUser,String so,String de) throws SQLException
	{
		
		insert.InsertIntoRideReq(cUser, so, de);
		
	}
	
	public void getRides(String Cuser) throws SQLException 
	{
		retrieve.GetMyRides(Cuser);
			
				
	}
	
	public Boolean UniqueUserNameChecker(String user) throws SQLException
	{
		if(retrieve.UserNameCheck(user)==true)
		{
			return true;
		}
		else
			return false;
	}
	
	
	
	public void AcceptOffer(String Cuser,String Cdriver,String Source,String Dest,int offer) throws SQLException
	{
		update.AcceptOffer(Cuser,Cdriver,Source,Dest,offer);
		
	}
	
	public void RateRide(String Cuser,String Cdriver,String Source,String Dest,int rate) throws SQLException
	{
		update.RateRide(Cuser,Cdriver,Source,Dest,rate);
	}
	
	

}
