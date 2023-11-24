import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to find if it is palindrome or not?");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverseString = "";
		int stringLength = str.length();
//		System.out.println(stringLength);
		
//		System.out.println("Entered string is: " + str);
		for(int i = (stringLength - 1); i >= 0; --i)
		{
			reverseString = str.charAt(i) + reverseString;
		}
		if(reverseString == str)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
