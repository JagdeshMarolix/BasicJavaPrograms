
public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String input_string = "RangeRover";
		char some_char = 'R';
		for(int i = 0; i < input_string.length(); i++)
		{
			if(input_string.charAt(i) == 'R')
			{
				count++;
			}
		}
		System.out.println("The count of a char occurances in a given string are: " + count);
	}

}
