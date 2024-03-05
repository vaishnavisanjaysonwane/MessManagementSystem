package Respotary_package;

import Model_package.LoginModel;

public class Login_repositery extends DBConnnection {
	
	public boolean isAdminloginfocorrect(LoginModel lmodel)
	{
		try {
			stmt = con.prepareStatement("select *from AdminLogin");
			rs = stmt.executeQuery();
			boolean flag=false;
			
			while(rs.next())
			{
				if((rs.getString(1).equalsIgnoreCase(lmodel.getUsername()))&&(rs.getString(2).equalsIgnoreCase(lmodel.getPassword())))
				{
					flag=true;
				}
			}
			return (flag)?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Exception in LoginRepo : "+ex);
			return false;
		}
	}
	
	public boolean isUserlogininfocorrect(LoginModel lmodel)
	{
		try {
			stmt = con.prepareStatement("select *from UserLogin");
			rs = stmt.executeQuery();
			boolean flag=false;
			
			while(rs.next())
			{
				if((rs.getString(1).equalsIgnoreCase(lmodel.getUsername()))&&(rs.getString(2).equalsIgnoreCase(lmodel.getPassword())))
				{
					flag=true;
				}
			}
			return (flag)?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Exception in LoginRepo : "+ex);
			return false;
		}
	}
}
