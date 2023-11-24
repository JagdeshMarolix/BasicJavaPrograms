import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of table");
		//int n = 5;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Table of " + n + " is");
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + "*" + i + "=" +(n*i) );
		}

	}
}
