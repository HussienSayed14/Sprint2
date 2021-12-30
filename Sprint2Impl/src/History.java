import java.sql.SQLException;

public class History {
	Data_Retrieving retrieve = new Data_Retrieving();
	
	public void UserRideHistory(String Cuser) throws SQLException
	{
		retrieve.UserRidesHistory(Cuser);
	}
	public void DriverRideHistory(String Cuser) throws SQLException
	{
		retrieve.UserRidesHistory(Cuser);
	}

}
