package com.hussien.demot;
import java.sql.SQLException;

public class Notifications {
	Data_Insertions insert = new Data_Insertions();
	Data_Retrieving retrieve = new Data_Retrieving();
	public void GetUserNotifications(String Cuser) throws SQLException
	{
		retrieve.NotifyUser(Cuser);
	}
	public void GetDriverNotifications(String Cuser) throws SQLException
	{
		retrieve.NotifyDriver_FavRides(Cuser);
		retrieve.NotifyDriverWithAcceptedOffers(Cuser);
	}
}
