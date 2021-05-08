package eCommerceLoginDemo.business.abstracts;

import eCommerceLoginDemo.entities.concretes.User;

public interface AuthService {
	void Register(User user);
	void Login(String email,String password);
}
