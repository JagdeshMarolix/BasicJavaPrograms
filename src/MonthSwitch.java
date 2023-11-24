import java.util.*;
public class MonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any month to be printed with numbering:");
		int month = sc.nextInt();
		switch(month){
			case 1: 
				System.out.println("the month is january"); 
			break;
			case 2:
				System.out.println("the month is february");
			break;
			case 3:
				System.out.println("the month is march");
			break;
			case 4:
				System.out.println("the month is april");
			break;
			case 5:
				System.out.println("the month is may");
			break;
			case 6:
				System.out.println("the month is june");
			break;
			case 7:
				System.out.println("the month is july");
			break;
			case 8:
				System.out.println("the month is august");
			break;
			case 9:
				System.out.println("the month is september");
			break;
			case 10:
				System.out.println("the month is october");
			break;
			case 11:
				System.out.println("the month is november");
			break;
			case 12:
				System.out.println("the month is december");
			break;
			default: 
				System.out.println("there is no month selection");
		}
		
	}
}