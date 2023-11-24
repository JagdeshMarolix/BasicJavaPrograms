import java.util.Scanner;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "This   is   Jagdeesh";
		System.out.println("Enter the string with spaces");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		String newstring = str.replace(" ", ""); // with built in method 
//		System.out.println(newstring);
		
		char[] strarry = str.toCharArray();
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < strarry.length; i++)
		{
			if((strarry[i] != ' ') && (strarry[i] != '\t'))
				buff.append(strarry[i]);
			
		}
		String noSpacestr2 = buff.toString();
		System.out.println(noSpacestr2);

	}

}
