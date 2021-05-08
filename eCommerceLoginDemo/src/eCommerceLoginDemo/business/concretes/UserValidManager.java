package eCommerceLoginDemo.business.concretes;

import java.util.regex.Pattern;

import eCommerceLoginDemo.business.abstracts.UserValidService;
import eCommerceLoginDemo.core.utils.rules.ValidationRules;
import eCommerceLoginDemo.entities.concretes.User;

public class UserValidManager implements UserValidService{

	@Override
	public boolean validate(User user) {
		boolean result=ValidationRules.Run(
				emailFormatValid(user.getEmail()),
				firstNameValid(user.getFirstName()),
				lastNameValid(user.getLastName()),
				passwordLengthValid(user.getPassword())
				);
		return result;
	}
	
	private boolean emailFormatValid(String email) {
		return Pattern.matches("[a-z0-9]+@[a-z0-9]+\\.[a-z]+", email);
	}
	
	private boolean passwordLengthValid(String password) {
		return password.length()>5;
	}
	
	private boolean firstNameValid(String firstName) {
		return firstName.length()>1;
	}
	
	private boolean lastNameValid(String lastName) {
		return lastName.length()>1;
	}

}
