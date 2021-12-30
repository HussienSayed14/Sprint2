import java.sql.SQLException;

public class Data_Updating extends MyDataBase {
	
	
	
	public void EndRide(String Cdriver) throws SQLException
	{
		createConnection();
		
		String dbo="update rides_offer set RideStat='Ended' where DriverName= '"+Cdriver +"' and RideStat='Accepted' ";
		stmt.execute(dbo);
	}
	
	public void UpdateBalace(String Cdriver,int offer) throws SQLException
	{
		createConnection();
		String dbo="update driverinfo set Balance=Balance+" + offer + " where UserName= '"+Cdriver +"'";
		stmt.execute(dbo);
		
	}
	
	public void RateRide(String Cuser,String Cdriver,String Source,String Dest,int rate) throws SQLException
	{
		createConnection();
		String dbo="update rides_offer set Rate="+rate+" where UserName='"+Cuser+"' and Source='"+Source+"' and Dest='"+Dest+"' and DriverName='"+Cdriver+"'";
		
		stmt.execute(dbo);
		
	}
	
	public void AcceptOffer(String Cuser,String Cdriver,String Source,String Dest,int offer) throws SQLException
	{
		createConnection();
		String dbo="update rides_offer set RideStat='Accepted' where UserName= '"+ Cuser+ "' and DriverName= '"+Cdriver+"' and Source= '"+Source+"' and Dest= '"+Dest+ "' and Offer="+offer;
		stmt.execute(dbo);
	}

	

}
