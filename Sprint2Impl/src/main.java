import java.sql.SQLException;


import java.util.Scanner;

public class main {
		static Users user1; 
		static Driver driver1 = new Driver();
	static Driver_functions d1=new Driver_functions();
	static User_functions u1= new User_functions();
	static Notifications notify=new Notifications();
	static History history = new History();
	
	
	int choice_lo;

	public static void main(String[] args)throws SQLException  {
		
	
		String CurrentUser="hussien"; 
		
		Scanner cin =new Scanner(System.in);
		
		Admin ad=new Admin();
		
		
		int choice=0;
		
		String type;
		String user;
		
		while(true)
		{
			while(true)
			{
				System.out.println("Driver or User?");
				 type =cin.next();
			System.out.print("1)Register \n2)Login");
			int choicel = cin.nextInt();
			
			if(choicel == 1)
			{
				if(type.equals("User"))
				{
				while(true)
				{
					
				System.out.println("Enter username");
				user=cin.next();
				if(u1.UniqueUserNameChecker(user)==false)
				{
					System.out.println("This UserName is taken, Try AnotherOne..");
				}
				else if(u1.UniqueUserNameChecker(user)==true)
				{
					break;
				}
				
				}
				System.out.println("Enter Password");
				String pass=cin.next();
				System.out.println("Enter phone");
				int phone = cin.nextInt();
				user1 = new User();
				user1.Register(user, pass, phone);
				
				System.out.println("Registered Successfully");
			}
				
				else if(type.equals("Driver"))
				{
					while(true)
					{
						boolean flag1=true;
					System.out.println("Enter username");
					user=cin.next();
					
					if(d1.UniqueUserNameChecker(user)==false)
					{
						System.out.println("This UserName is taken, Try AnotherOne..");
					}
					else if(d1.UniqueUserNameChecker(user)==true)
					{
						break;
					}
					}
					
					
					
					System.out.println("Enter Password");
					String pass=cin.next();
					System.out.println("Enter phone");
					int phone = cin.nextInt();
					System.out.println("Enter License");
					String lic = cin.next();
					System.out.println("Enter ID");
					int id = cin.nextInt();
					
					 user1 = new Driver();
					
					driver1.RegisterD(user, pass, phone,lic,id);
					
					System.out.println("Registered Successfully");
				}
					
				}
				
				
			
			else if(choicel == 2)
			{
				if(type.equals("User"))
				{
					user1 = new User();
				while(true)
				{
					System.out.println("Enter username");
					 user=cin.next();
					
					if(u1.UniqueUserNameChecker(user)==false)
					{
						break;
					}
					else
						System.out.println("UserName is not Found..");
						
					 
					}

				
				System.out.println("Enter Password");
				String pass=cin.next();
				user1.Login(user, pass);
				CurrentUser=user;
				
				
			}
				
				else if(type.equals("Driver"))
				{
					user1=new Driver();
					
					while(true)
					{
						System.out.println("Enter username");
						 user=cin.next();
						
						
						if(d1.UniqueUserNameChecker(user)==false)
						{
							break;
						}
						else
							System.out.println("UserName is not Found..");
						
					}

					
					System.out.println("Enter Password");
					String pass=cin.next();
					user1.Login(user, pass);
					CurrentUser = user;
				}
			}
			
			
			if(user1.getStat()== true)
			{
				break;
			}
			else
			{
				continue;
			}
			}
			
		while(choice!=10)
	{ 
		

		if(type.equals("Driver"))
	{
			 
			System.out.println("1)add fav area 2)List Fav rides 3)GetNotifications 4)MakeOffer 5)End A Trip 6)RidesHistory 7)LogOut 10)EXIT");
		choice=cin.nextInt();
		if(choice==1)
		{
			
			System.out.println("Enter your fav area");
			String FavArea = cin.next();
			
			d1.addFav(CurrentUser,FavArea);
			System.out.print("\n");
			
			}
		else if(choice==2) 
		{
			
			
			d1.RidesWithFavArea(CurrentUser);
		}
		else if(choice==3) 
		{
			notify.GetDriverNotifications(CurrentUser);
		}
		else if (choice == 4)
		{
			System.out.println("Choose the ride \n");
			d1.RidesWithFavArea(CurrentUser);
			System.out.println("Enter The User's UserName");
			String usern= cin.next();
			System.out.println("Enter Source ");
			String so = cin.next();
			System.out.println("Enter Dest");
			String de =cin.next();
			System.out.println("Enter your offer");
			int of = cin.nextInt();
		    d1.MakeOffer(usern, CurrentUser, so, de, of);
			
		}
		
		else if(choice==5)
		{
			System.out.println("Current Ride ");
			notify.GetDriverNotifications(CurrentUser);
			System.out.println("Choose UserName:");
			String cUSER=cin.next();
			System.out.println("Choose offer:");
			int offer=cin.nextInt();

			d1.AddToBalance(CurrentUser,offer);
			d1.EndRide(CurrentUser);
		}
		else if(choice==6)
		{
			history.DriverRideHistory(CurrentUser);
		}
		else if(choice==7)
		{
			break;
		}
		
		
		}
		else if(type.equals("User"))
		{
			
			System.out.println("1)Request Ride 2)List rides 3)GetNotification  4)Choose an Offer 5)Rate A Ride 6)Rides History 7)Log out  10)EXIT");
			choice=cin.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Source");
				String Source = cin.next();
				System.out.println("Enter Dest");
				String Dest = cin.next();
				u1.ReqRide(CurrentUser,Source, Dest);
			
			
				}
			else if(choice==2)
			{
				
				u1.getRides(CurrentUser);
				
			
			}
			else if(choice == 3)
			{
				notify.GetUserNotifications(CurrentUser);
				
			}
			else if(choice==4)
			{
				System.out.println("Choose A ride from the following");
				notify.GetUserNotifications(CurrentUser);
				System.out.println("Choose Driver Name");
				String driverNAME=cin.next();
				System.out.println("Choose Source:");
				String source=cin.next();
				System.out.println("Choose Dest:");
				String Dest=cin.next();
				System.out.println("Choose Offer");
				int offer=cin.nextInt();
				u1.AcceptOffer(CurrentUser,driverNAME,source,Dest,offer);
				




				
			}
			else if(choice==5)
			{
				System.out.println("Choose A ride from the following");
				history.UserRideHistory(CurrentUser);
				System.out.println("Choose Driver Name");
				String driverNAME=cin.next();
				System.out.println("Choose Source:");
				String source=cin.next();
				System.out.println("Choose Dest:");
				String Dest=cin.next();
				System.out.println("Enter Rate");
				int rate=cin.nextInt();
				
				u1.RateRide(CurrentUser,driverNAME,source,Dest,rate);
			}
			else if(choice==6)
			{
				history.UserRideHistory(CurrentUser);
			}
			else if(choice==7)
			{
				break;
			}
			
		}
	}
	}
}
}
