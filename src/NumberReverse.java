import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to be reversed");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse = 0;
		int temp = number; // for palindrome 
		while(number!=0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;		
		}
		System.out.println("the reversed of a number is: " + reverse);
		// the logic of reversing a number ends here with this line
		
		if(temp == reverse)  // the logic of palindrome starts from here
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
