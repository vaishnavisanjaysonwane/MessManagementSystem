package Client_Application;
import java.util.*;

import Model_package.LoginModel;
import Service_Package.Login_service;
public class Client_DriverClass {

	public static void main(String[] args) {
	
		Login_service lservice = new Login_service();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1: Admin Login");
			System.out.println("2: User Login");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					sc.nextLine();
					System.out.println("Enter UserName : ");
					String username = sc.nextLine();
					System.out.println("Enter Password : ");
					String password = sc.nextLine();
					LoginModel lmodel = new LoginModel();
					lmodel.setUsername(username);
					lmodel.setPassword(password);
					boolean b = lservice.isAdminloginfocorrect(lmodel);
					if(b)
					{
						do {
							System.out.println("1:Register Member");
							System.out.println("2:Check Category of Member");
							System.out.println("3:Admit Monthly member with advance amount");
							System.out.println("4:Attendance of Candidate");
							System.out.println("5:Mothly bill of Memeber");
							System.out.println("6:Count Walking Member");
							System.out.println("7:Count Monthly Member");
							System.out.println("8:Get Total bill of Monthly Member");
							System.out.println("9:Get Total bill of Walking Member");
							System.out.println("10:Set Per plate rate for Walking member");
							System.out.println("11:Set Per plate rate for Monthly member");
							System.out.println("12:Show bill comparison between Monthly Member and Walking Member");
							System.out.println("Enter your choice : ");
							choice = sc.nextInt();
							switch(choice)
							{
								case 1:
									sc.nextLine();
									System.out.println("Enter id of Member : ");
									int id = sc.nextInt();
									sc.nextLine();
									System.out.println("Enter name of Member : ");
									String name = sc.nextLine();
									System.out.println("Enter Contact of Member : ");
									String contact = sc.nextLine();
									break;
							}
						}
						while(true);
					}else {
						System.out.println("Wrong username and Password");
						}
					break;
					
				case 2:
					sc.nextLine();
					LoginModel lgmodel = new LoginModel();
					System.out.println("Enter UserName : ");
					username = sc.nextLine();
					System.out.println("Enter Password : ");
					password = sc.nextLine();
					lgmodel.setUsername(username);
					lgmodel.setPassword(password);
					b = lservice.isUserlogininfocorrect(lgmodel);
					if(b)
					{
						do {
							System.out.println("1:Show All Menu");
							System.out.println("2:Monthly Mess Plans");
							System.out.println("Enter Your Choice : ");
							choice = sc.nextInt();
							switch(choice)
							{
							 	case 1:
							 		break;
							}
						}
						while(true);
					}else {
						System.out.println("Wrong username and Password");
						}
					break;
			}
		}
		while(true);
		
	}

}
