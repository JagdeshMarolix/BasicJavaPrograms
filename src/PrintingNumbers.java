import java.util.Scanner;

public class PrintingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the maximum number you want to print starting from 1");
		for(int i=1; i<n; i++)
		{
			System.out.println(i);
		}

	}

}
