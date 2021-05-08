package eCommerceLoginDemo.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eCommerceLoginDemo.business.abstracts.UserService;
import eCommerceLoginDemo.core.utils.mail.MailService;
import eCommerceLoginDemo.dataAccess.abstracts.UserDao;
import eCommerceLoginDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		this.userDao.add(user);
	}

	

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.getAll();
	}
	
	

	@Override
	public boolean checkIfMailExist(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return this.userDao.getByEmail(email);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return this.getUser(id);
	}

}
