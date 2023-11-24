import java.util.*;
public class Charcount
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string to check the number of characters?");
		Scanner sc = new Scanner(System.in);

		
		String str = sc.nextLine();
		
//		String str = "hello world";
		int count = 0;
		System.out.println("the entered string is: " + str);
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ' )
			{
				count++;
			}
			
		}
		System.out.println("total number chararcters in a given string are: " + count);
	}
	

}