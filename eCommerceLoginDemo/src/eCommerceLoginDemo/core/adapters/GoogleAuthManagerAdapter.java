package eCommerceLoginDemo.core.adapters;

import eCommerceLoginDemo.business.abstracts.AuthService;
import eCommerceLoginDemo.entities.concretes.User;
import eCommerceLoginDemo.google.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void Register(User user) {
		GoogleAuthManager googleAuthManager=new GoogleAuthManager();
		googleAuthManager.register(user.getFirstName(), user.getLastName(), 
				user.getEmail(), user.getPassword());
		
		
	}

	@Override
	public void Login(String email, String password) {
		GoogleAuthManager googleAuthManager=new GoogleAuthManager();
		googleAuthManager.login(email, password);
	}

}
