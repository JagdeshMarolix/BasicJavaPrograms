import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the subject marks out of 300");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		System.out.println("marks are "+ marks);
		if(marks >= 290 && marks <= 300)
		{
			System.out.println("the grade is outstanding O");
		}
		else if(marks >= 250 && marks <= 289)
		{
			System.out.println("the grade is A");
		}
		else if(marks >= 150 && marks <= 249)
		{
			System.out.println("The Grade is B");
		}
		else if (marks >= 100 && marks <= 149)
		{
			System.out.println("The grade is C");
		}
		else if (marks > 300)
		{
			System.out.println("invalid selection");
		}
		else {
			System.out.println("Detained");
		}

	}

}
