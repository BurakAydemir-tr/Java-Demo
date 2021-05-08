package eCommerceLoginDemo.business.abstracts;

import eCommerceLoginDemo.entities.concretes.User;

public interface UserValidService {
	public boolean validate(User user);
}
