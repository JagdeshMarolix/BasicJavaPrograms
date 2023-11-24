import java.util.Scanner;

public class RangeOfEvenNumbers {
	public static void main(String[] args) 
	{
		System.out.println("Enter the even numbers between 1 to range given:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
