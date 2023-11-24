import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether it's armstrong?");
		int number = sc.nextInt();
		
		int temp = number;
		int remainder, sum = 0;
		
		while(number > 0)
		{
			remainder = number % 10;
			number = number / 10;
			sum = sum + (remainder * remainder * remainder);
			
		}
		if (temp == sum)
		{
			System.out.println("entered number is an armstrong");
		}
		else
		{
			System.out.println("entered number is not an armstrong");
		}

	}

}
