import java.sql.SQLException;

public class Data_Retrieving extends MyDataBase {
	
	public void GetMyRides(String CurrentUser) throws SQLException
	{
		createConnection();
		rs=stmt.executeQuery("select u.UserName,u.Source,u.Dest from ridereq u where u.UserName= '" + CurrentUser + "' ");
		System.out.println("UserName   Source   Dest");
		while(rs.next()) 
		{
			String un=rs.getString("u.UserName");
			
			String s=rs.getString("u.Source");
			
			String d=rs.getString("u.Dest");
			
			System.out.println(un+"   " + s + "   " + d);
			
			
		}
	}
	
	public void GetRidesWithFavArea(String CurrentUser) throws SQLException
	{
		createConnection();
		rs=stmt.executeQuery("select r.UserName,r.Source, r.Dest from ridereq r,driverfavareas d where r.Source=d.FavArea and  d.UserName= '" + CurrentUser + "' ");
		System.out.println("UserName   Source   Dest");
		while(rs.next()) 
		{
			String un=rs.getString("r.UserName");
			
			String s=rs.getString("r.Source");
			
			String d=rs.getString("r.Dest");
			
			System.out.println(un+"   " + s + "   " + d);
			
		}
	}
	
	public boolean UserNameCheck(String user) throws SQLException
	{
		
		createConnection();
		boolean flag1=true;
		rs=stmt.executeQuery("SELECT UserName FROM userinfo");
		while(rs.next())
		{
			
			String name =rs.getString("UserName");
			if(user.equals(name))
			{
				
				flag1=false;
				
			}
			
		}
		
		return flag1;
		
	}
	public boolean DriverUserNameCheck(String user) throws SQLException
	{
		
		createConnection();
		boolean flag1=true;
		rs=stmt.executeQuery("SELECT UserName FROM driverinfo ");
		while(rs.next())
		{
			
			String name =rs.getString("UserName");
			if(user.equals(name))
			{
				
				flag1=false;
				
			}
			
		}
		
		return flag1;
		
		}
	
	public boolean UserLogin(String user,String pass) throws SQLException
	{
		 boolean status=false;
			createConnection();
			rs=stmt.executeQuery("SELECT Password FROM userinfo WHERE UserName ='" + user + "'");
			rs.next();
			String Pass=rs.getString("Password");
		 if(pass.equals(Pass))
			{
				
				status=true;
			}
			else
			{
				
				status =false;
				
			}
			return status;
			
	}
	
	public boolean DriverLogin(String user,String pass) throws SQLException
	{
		boolean status=false;
		createConnection();
		rs=stmt.executeQuery("SELECT Password FROM driverinfo WHERE UserName ='" + user + "'");
		rs.next();
		String Pass=rs.getString("Password");
	 if(pass.equals(Pass))
		{
			
			status=true;
		}
		else
		{
			
			status =false;
			
		}
		return status;
		
		
	}
	
	public void NotifyDriver_FavRides(String Cuser) throws SQLException
	{
		createConnection();
		rs=stmt.executeQuery("select r.UserName,r.Source, r.Dest from ridereq r,driverfavareas d where r.Source=d.FavArea and d.UserName= '" + Cuser + "' ");
		//System.out.println("UserName   Source   Dest");
		while(rs.next()) 
		{
			String un=rs.getString("r.UserName");
			
			String s=rs.getString("r.Source");
			
			String d=rs.getString("r.Dest");
			
			System.out.println( un + ": Made a request from: "+ s + " To: "+d );
			
			}
	}
	
	public void NotifyDriverWithAcceptedOffers(String CurrentDriver) throws SQLException
	{
		createConnection();
		rs=stmt.executeQuery("select r.UserName, r.Source, r.Dest,r.Offer from rides_offer r where DriverName= '"+CurrentDriver+"' and RideStat='Accepted'");
		while(rs.next())
		{
			String UserName=rs.getString("r.UserName");
			String so=rs.getString("r.Source");
			String de=rs.getString("r.Dest");
			int offer=rs.getInt("r.Offer");
			System.out.println( UserName + ": Accepted Offer: "+ offer );
		}
	}
	
   public void UserRidesHistory(String Cuser) throws SQLException
	{
		createConnection();
		System.out.println("DriverName   Source   Dest   Offer   Rate");

		rs=stmt.executeQuery("Select d.Offer,d.DriverName,d.Source,d.Dest,d.Rate from rides_offer d where RideStat='Ended' and  UserName='"+Cuser+"'");
		while (rs.next())
		{
		int offer=rs.getInt("d.Offer");
		String so=rs.getString("d.Source");
		String de=rs.getString("d.Dest");
		String Dname=rs.getString("d.DriverName");
		int rate=rs.getInt("d.Rate");
		
		System.out.println(Dname+"   "+so+"   "+de+"    "+offer+"    "+rate );
		}
		
	}
	
	public void NotifyUser(String Cuser) throws SQLException
	{
		createConnection();
		rs=stmt.executeQuery("select d.DriverName , d.Source,d.Dest,d.Offer from rides_offer d where d.RideStat='Waiting' and d.UserName ='"+Cuser +"'");
		
		while(rs.next())
		{
			String DriverName = rs.getString("d.DriverName");
			
			String so = rs.getString("d.Source");
			
			String de = rs.getString("d.Dest");
			
			int offer = rs.getInt("d.Offer");
			
			System.out.println(DriverName+ ": Made an offer  from: "+ so + " To: "+de +" With Offer: " +offer +"EGP" );
			
			
		}
	}
	public void DriverRidesHistory(String Cdriver) throws SQLException
	{
		createConnection();
		System.out.println("UserName   Source   Dest   Offer   Rate");

		rs=stmt.executeQuery("Select d.Offer,d.UserName,d.Source,d.Dest,d.Rate from rides_offer d where RideStat='Ended' and DriverName='"+Cdriver+"'");
		while (rs.next())
		{
		int offer=rs.getInt("d.Offer");
		String so=rs.getString("d.Source");
		String de=rs.getString("d.Dest");
		String Uname=rs.getString("d.UserName");
		int rate=rs.getInt("d.Rate");
		
		System.out.println(Uname+"   "+so+"   "+de+"    "+offer+"    "+rate );
		}
		
	}
	
}
