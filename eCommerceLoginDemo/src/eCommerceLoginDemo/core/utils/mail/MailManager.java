package eCommerceLoginDemo.core.utils.mail;

import java.util.Scanner;

public class MailManager implements MailService{

	@Override
	public void sendMail(String mailAdress, String message) {
		System.out.println("Send to : "+mailAdress+" Mail : "+message);
		
		
	}

	@Override
	public boolean getVerification() {
		/*Scanner entry=new Scanner(System.in);
		System.out.println("Onaylamak için : yes/no");
		String onay=entry.next();
		System.out.println(onay);
		if(onay.toString()=="yes") {
			return true;
		}else {
			return false;
		}*/
		return true;
		
	}
	
	

}
