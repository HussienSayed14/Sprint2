import java.sql.SQLException;



public class Driver_functions {
	
	
	public boolean offer = false;
	Data_Insertions insert=new Data_Insertions();
	Data_Retrieving retrieve = new Data_Retrieving();
	Data_Updating update = new Data_Updating();

	public void addFav(String cUser, String favArea) throws SQLException 
	{
		
		insert.InsertIntoFavArea(cUser, favArea);

	}
	
	
	
	public void MakeOffer(String UserName,String DriverName,String source,String Dest,int offer) throws SQLException
	{
		insert.InsertIntoDriver_RidesOffer(UserName,DriverName, source, Dest, offer);
		
	}
	
	public void EndRide(String CurrentDriver) throws SQLException
	{
		
		update.EndRide(CurrentDriver);
	}
	
	public void AddToBalance(String Cdriver,int offer) throws SQLException
	{

		update.UpdateBalace(Cdriver, offer);
		
	}
	

	

	public void RidesWithFavArea(String Cuser) throws SQLException 
	{
		retrieve.GetRidesWithFavArea(Cuser);
	}

		
		
	public Boolean UniqueUserNameChecker(String user) throws SQLException
	{
		if(retrieve.DriverUserNameCheck(user)==true)
		{
			return true;
		}
		else
			return false;
	}
	

}
