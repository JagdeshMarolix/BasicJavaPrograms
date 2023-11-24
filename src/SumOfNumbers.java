import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the sum of numbers from 1 to ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //6
		int sum=0; //21
		for(int i=1; i<=n; i++)
		{
			sum = sum+i; //2+1,3+3,4+6,10+5,15+6
			
		}
		System.out.println("Sum of first natural numbers: " + sum);
//		System.out.println("Hi Vennela");
//		System.out.println("This is Jagdeesh");

	}

}
