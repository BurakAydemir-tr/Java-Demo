package eCommerceLoginDemo.google;

public class GoogleAuthManager {
	public void login(String email,String password) {
		System.out.println("Google ile giri� yap�ld� : "+email);
	}
	
	public void register(String firstName,String lastName,String email,String password) {
		System.out.println("Google kay�t olundu : "+firstName+" "+lastName);
	}
}
