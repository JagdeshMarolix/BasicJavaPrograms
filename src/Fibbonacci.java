import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of numbers");
		
		int num = sc.nextInt();
		
		int a = 0, b = 1, c;
		
		for(int i =1; i<=num; i++)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}

}
