package com.hussien.demot;
import java.sql.SQLException;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("History")
public class History {
	Data_Retrieving retrieve = new Data_Retrieving();
	@GET
	@Path("/UserRideHistory")
	@Produces(MediaType.APPLICATION_XML	)
	public void UserRideHistory(@QueryParam("Cuser")String Cuser) throws SQLException
	{
		retrieve.UserRidesHistory(Cuser);
	}
	@GET
	@Path("/DriverRideHistory")
	@Produces(MediaType.APPLICATION_XML	)
	public void DriverRideHistory(@QueryParam("Cuser")String Cuser) throws SQLException
	{
		retrieve.UserRidesHistory(Cuser);
	}

}
