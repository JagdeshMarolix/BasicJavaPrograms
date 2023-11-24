package oops;
abstract class Animal {
	abstract void walk();
		void breathe() {
			System.out.println("This animal breathes air");
		}
		Animal() {
			System.out.println("You are about to create an animal");
		}
	}
class Horse extends Animal {
	Horse() {
		System.out.println("Wow you have created a horse");
	}
	void walk() {
		System.out.println("Horse walks on 4 legs");
	}	
}
class Chicken extends Animal {
	Chicken() {
		System.out.println("you have created a chicken");
	}
	void walk() {
		System.out.println("chicken walks on 2 legs");
	}	
}
public class OOPS {

	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		horse.breathe();
		// TODO Auto-generated method stub

	}

}
