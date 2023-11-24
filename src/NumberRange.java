import java.util.*;
public class NumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print a range of numbers from 1 to 50");
		int number = 50;
		for (int i=1; i<=number; i++)
		{
//			System.out.println(i);
			//1,2,3,4,5.............................50
			if(i % 3 == 0) 
			{
				System.out.println("Orange");
			}
			if(i % 5 == 0)
			{
				System.out.println("Mango");
			}
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("orange and yellow");
			}
			if (i % 3!=0 && i %5 != 0)
			{
				System.out.println(i);
			}
		}

	}

}
