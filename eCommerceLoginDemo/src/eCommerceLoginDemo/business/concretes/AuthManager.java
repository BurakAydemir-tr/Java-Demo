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
			System.out.println("Validasyon i�lemi ba�ar�s�z");
			return;
		}
		if(!userService.checkIfMailExist(user.getEmail())) {
			System.out.println("Bu e-posta edresi sistemde kay�tl�");
			return;
		}
		System.out.println("Kay�t i�lemi ba�ar�l�. Do�rulama adresi epostan�za g�nderilmi�tir.");
		mailService.sendMail(user.getEmail(), "Do�rulama maili");
		userService.add(user);
		
		
	}

	@Override
	public void Login(String email, String password) {
		User getUser=userService.getByEmail(email);
		if(getUser==null) {
			System.out.println("B�yle bir kullan�c� bulunamad�.");
			return;
		}else if(getUser.getPassword()!=password) {
			System.out.println("Yanl�� parola girdiniz.");
		}else {
			System.out.println("Ho� geldiniz "+getUser.getFirstName()+" "+getUser.getLastName());
		}
		
	}

}
