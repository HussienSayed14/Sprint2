package com.hussien.demot;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("DriverFunc")
public class Driver_functions {
	
	
	public boolean offer = false;
	Data_Insertions insert=new Data_Insertions();
	Data_Retrieving retrieve = new Data_Retrieving();
	Data_Updating update = new Data_Updating();
    @POST
    @Path("/AddFav")
  public void addFav(@QueryParam("Cuser")String cUser,@QueryParam("FavArea") String favArea) throws SQLException 
	{
		
		insert.InsertIntoFavArea(cUser, favArea);

	}
	
	
    @POST
    @Path("/MakeOffer")
	public void MakeOffer(@QueryParam("UserName")String UserName,@QueryParam("Dname")String DriverName,@QueryParam("so")String source,@QueryParam("Dest")String Dest,@QueryParam("offer")int offer) throws SQLException
	{
		insert.InsertIntoDriver_RidesOffer(UserName,DriverName, source, Dest, offer);
		
	}
	@PUT
	@Path("/endRIDE")

	public void EndRide(@QueryParam("Cdriver")String CurrentDriver) throws SQLException
	{
		
		update.EndRide(CurrentDriver);
	}
	@PUT
	@Path("/AddtoBalance")
	public void AddToBalance(@QueryParam("Cdriver")String Cdriver,@QueryParam("offer")int offer) throws SQLException
	{

		update.UpdateBalace(Cdriver, offer);
		
	}
	

	
 @GET
 @Path("/FavAreaRides")
	public void RidesWithFavArea(@QueryParam("Cuser")String Cuser) throws SQLException 
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
