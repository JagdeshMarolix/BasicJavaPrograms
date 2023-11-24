import java.util.*;
public class Stringreverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String originalstring = "Hello";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to be reversed:");
		String originalString = sc.nextLine();
		String reversedstring = "";		
		for (int i = 0; i < originalString.length(); i++)
		{
			reversedstring = originalString.charAt(i) + reversedstring;
		}
		System.out.println("original string is: " + originalString);
		System.out.println("Reversed String is: " + reversedstring);
		if(originalString.equalsIgnoreCase(reversedstring))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
