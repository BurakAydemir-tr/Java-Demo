package eCommerceLoginDemo.business.abstracts;

import java.util.List;

import eCommerceLoginDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
	boolean checkIfMailExist(String email);
	User getByEmail(String email);
	User getUser(int id);
}
