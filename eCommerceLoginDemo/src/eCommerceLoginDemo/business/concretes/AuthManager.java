package eCommerceLoginDemo.business.concretes;

import eCommerceLoginDemo.business.abstracts.AuthService;
import eCommerceLoginDemo.business.abstracts.UserService;
import eCommerceLoginDemo.business.abstracts.UserValidService;
import eCommerceLoginDemo.core.utils.mail.MailService;
import eCommerceLoginDemo.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	private UserValidService userValidService;
	private MailService mailService;
	
	public AuthManager(UserService userService,UserValidService userValidService,MailService mailService) {
		super();
		this.userService = userService;
		this.userValidService=userValidService;
		this.mailService=mailService;
	}

	@Override
	public void Register(User user) {
		if(!userValidService.validate(user)) {
			System.out.println("Validasyon iþlemi baþarýsýz");
			return;
		}
		if(!userService.checkIfMailExist(user.getEmail())) {
			System.out.println("Bu e-posta edresi sistemde kayýtlý");
			return;
		}
		System.out.println("Kayýt iþlemi baþarýlý. Doðrulama adresi epostanýza gönderilmiþtir.");
		mailService.sendMail(user.getEmail(), "Doðrulama maili");
		userService.add(user);
		
		
	}

	@Override
	public void Login(String email, String password) {
		User getUser=userService.getByEmail(email);
		if(getUser==null) {
			System.out.println("Böyle bir kullanýcý bulunamadý.");
			return;
		}else if(getUser.getPassword()!=password) {
			System.out.println("Yanlýþ parola girdiniz.");
		}else {
			System.out.println("Hoþ geldiniz "+getUser.getFirstName()+" "+getUser.getLastName());
		}
		
	}

}
