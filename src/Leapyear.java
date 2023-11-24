import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check whether it is leap year or not?");
		int year = sc.nextInt();
		System.out.println("the entered year is: " + year);
		if (year % 4 == 0 && year % 100 != 0)
		{
			System.out.println(year + " is leap year");
		}
		else 
		{
			System.out.println(year + " is a non leap year");
		}

	}

}
