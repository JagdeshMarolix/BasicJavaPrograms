import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is even or odd?");
		int number = sc.nextInt();
		System.out.println("You entered " + number);
		if (number % 2 == 0) {
			System.out.println("the number entered is even number ");
		} else {
			System.out.println("The number entered is odd number ");
		}
//		if(number % 3 == 0 )
//		{
//			System.out.println("the number entered is odd number");
//		}
//		else
//		{
//			System.out.println("The number entered is even number");
//		}
	}
}



