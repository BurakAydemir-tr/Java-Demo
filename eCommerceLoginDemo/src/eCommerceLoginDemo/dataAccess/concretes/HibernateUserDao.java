package eCommerceLoginDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceLoginDemo.dataAccess.abstracts.UserDao;
import eCommerceLoginDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> userDataBase=new ArrayList<User>();
	
	@Override
	public void add(User user) {
		userDataBase.add(user);
		System.out.println("Hibernate ile eklendi : "+user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		for(User user:userDataBase) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDataBase;
	}

	@Override
	public User getByEmail(String email) {
		for(User user:userDataBase) {
			if(user.getEmail()==email) {
				return user;
			}
		}
		return null;
	}

}
