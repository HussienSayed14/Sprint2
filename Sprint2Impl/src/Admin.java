
public class Admin  {
	
	
	
	boolean veri ;
	
	
	

	public void verify(Users obj)
	{
		
		if(obj.getID()>0)
		{
			veri= true;
			
		}
		else 
		{
			veri= false;
		}
	}
	}

