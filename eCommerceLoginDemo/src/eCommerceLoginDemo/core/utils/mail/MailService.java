package eCommerceLoginDemo.core.utils.mail;

public interface MailService {
	void sendMail(String mailAdress,String message);
	boolean getVerification();
}
