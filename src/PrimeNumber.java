import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not?");
		int n = sc.nextInt();
		System.out.println("you entered: " + n);
		for(int i=1; i <=n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}if(count == 2) // the number which has only two factors will be prime number
		{
			System.out.println(n + " is a prime number");
		}
		else 
		{
			System.out.println(n + " is not a prime number"); // the number which has more than 2 factors will not be a prime number
		}

	}

}
