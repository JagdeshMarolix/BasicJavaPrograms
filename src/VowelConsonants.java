import java.util.*;
public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check vowel / consonant? ");
		char ch = sc.next().charAt(0);
		System.out.println("Your entered character is: " + ch);
		System.out.println("character converted into lowerCase  " + Character.toLowerCase(ch));
		if 
				(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					System.out.println(ch + " is a vowel");	
		else
		
			System.out.println(ch + " is a consonant");
		
		
	}

}
