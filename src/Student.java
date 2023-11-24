
public class Student extends Subject {
	void StudentDetails() {
		System.out.println("Student name is Mark Hobbs");
	}
	
	

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.StudentDetails();
		s1.FavouriteSubject();
		s1.game();
		

	}

}
