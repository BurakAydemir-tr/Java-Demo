package eCommerceLoginDemo;


import eCommerceLoginDemo.business.abstracts.AuthService;
import eCommerceLoginDemo.business.abstracts.UserService;
import eCommerceLoginDemo.business.abstracts.UserValidService;
import eCommerceLoginDemo.business.concretes.AuthManager;
import eCommerceLoginDemo.business.concretes.UserManager;
import eCommerceLoginDemo.business.concretes.UserValidManager;
import eCommerceLoginDemo.core.adapters.GoogleAuthManagerAdapter;
import eCommerceLoginDemo.core.utils.mail.MailManager;
import eCommerceLoginDemo.core.utils.mail.MailService;
import eCommerceLoginDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceLoginDemo.entities.concretes.User;
import eCommerceLoginDemo.google.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User(1,"avcý","den","abc@den.com","123456");
		
		UserService userService=new UserManager(new HibernateUserDao());
		userService.add(user);
		
		/*AuthService authService=new AuthManager(userService, 
				new UserValidManager(), new MailManager());
		
		authService.Register(user);
		authService.Login("abc@den.com", "123456");
		*/
		
		
		User user2=new User(1,"Burak","Aydemir","burak@gmail.com","123456");
		userService.add(user2);
		
		AuthService authService= new GoogleAuthManagerAdapter();
		authService.Register(user2);
		authService.Login("burak@gmail.com", "123456");
		
		
	}

}
