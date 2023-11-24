import java.util.Scanner;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string with special characters:");
		Scanner sc = new Scanner(System.in);
		String str1	= sc.nextLine();
		String Finalstring = "";
		System.out.println("Entered string is: " + str1);
		
		
		for(int i = 0; i < str1.length(); i++)
		{
			if((str1.charAt(i) > 65) && (str1.charAt(i) < 122))
			{
				Finalstring = Finalstring + str1.charAt(i);
			}
		}
		
		System.out.println("the string after removing special characters are: " + Finalstring);

	}

}
