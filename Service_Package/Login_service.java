package Service_Package;

import Model_package.LoginModel;
import Respotary_package.Login_repositery;

public class Login_service {
	Login_repositery lrepo = new Login_repositery();
	
	public boolean isAdminloginfocorrect(LoginModel lmodel)
	{
		return lrepo.isAdminloginfocorrect(lmodel);
	}

	public boolean isUserlogininfocorrect(LoginModel lmodel)
	{
		return lrepo.isUserlogininfocorrect(lmodel);
	}

	

}



