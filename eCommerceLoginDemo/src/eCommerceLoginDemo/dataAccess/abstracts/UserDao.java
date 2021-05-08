package eCommerceLoginDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceLoginDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	User get(int id);
	List<User> getAll();
	User getByEmail(String email);
}
