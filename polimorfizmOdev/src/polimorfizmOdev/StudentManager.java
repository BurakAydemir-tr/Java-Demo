package polimorfizmOdev;

public class StudentManager extends UserManager {
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName()+" Kursa kat�ld�");
	}
	
	public void removeCourse(Student student) {
		System.out.println(student.getFirstName()+" Kurstan ��kar�ld�.");
	}
}
