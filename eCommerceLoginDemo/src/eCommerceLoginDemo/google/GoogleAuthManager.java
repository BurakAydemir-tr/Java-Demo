package eCommerceLoginDemo.google;

public class GoogleAuthManager {
	public void login(String email,String password) {
		System.out.println("Google ile giriþ yapýldý : "+email);
	}
	
	public void register(String firstName,String lastName,String email,String password) {
		System.out.println("Google kayýt olundu : "+firstName+" "+lastName);
	}
}
