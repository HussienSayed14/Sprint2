package com.hussien.demot;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("UserFunctions")
public class User_functions {
	
	Data_Insertions insert = new Data_Insertions();
	 Data_Retrieving retrieve = new Data_Retrieving();
	 Data_Updating update = new Data_Updating();

	    @POST
		@Path("/ReqRide")
		public void ReqRide(@QueryParam("Cuser")String cUser,@QueryParam("so")String so,@QueryParam("Dest")String de) throws SQLException
	{
		
		insert.InsertIntoRideReq(cUser, so, de);
		
	}

    @GET
    @Path("/getRides")
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
	
	
	@PUT
	@Path("/AcceptOffer")
	public void AcceptOffer(@QueryParam("Cuser")String Cuser,@QueryParam("Cdriver")String Cdriver,@QueryParam("so")String Source,@QueryParam("dest")String Dest,@QueryParam("offer")int offer) throws SQLException
	{
		update.AcceptOffer(Cuser,Cdriver,Source,Dest,offer);
		
	}
	@PUT
	@Path("/RateRide")
	public void RateRide(@QueryParam("Cuser")String Cuser,@QueryParam("Cdriver")String Cdriver,@QueryParam("so")String Source,@QueryParam("dest")String Dest,@QueryParam("rate")int rate) throws SQLException
	{
		update.RateRide(Cuser,Cdriver,Source,Dest,rate);
	}
	
	

}
