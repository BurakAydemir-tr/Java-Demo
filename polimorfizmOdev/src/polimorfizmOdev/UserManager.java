package polimorfizmOdev;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" silindi");
	}
}
