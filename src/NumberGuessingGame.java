import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number, guess, tries=0;
		number = (int) (Math.random()*10) + 1;
		System.out.println(number);
		
		System.out.println("===Number Guessing Game===");
		
		do {
			System.out.println("Guess any number between 1 to 10:");
			guess = sc.nextInt();
			
			 int attempts = tries++;
			 
			 System.out.println("you have tried " + attempts + " times ");
			
			if(guess > number) {
				System.out.println("Number too high");
			}
			else if(guess < number) {
				System.out.println("Number too low");
			}
			else if (guess == number){
				System.out.println("exact Match!!");
				break;
			}
		}
		while(guess != number);
			
		
		

	}

}
