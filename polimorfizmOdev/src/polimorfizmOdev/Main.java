package polimorfizmOdev;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Ramazan");
		student1.setLastName("Bacak");
		student1.setEmail("ramazan@gmail.com");
		student1.setStudentCategory("5. sınıf");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Burak");
		instructor1.setLastName("Aydemir");
		instructor1.setEmail("aydemir@gmail.com");
		
		UserManager userManager=new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.joinCourse(student1);
		studentManager.removeCourse(student1);
	}

}
