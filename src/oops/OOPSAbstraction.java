package oops;
interface Animals {
	void walk();
}
class Lion implements Animals {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Hen implements Animals {
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}
public class OOPSAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		l.walk();
	}
}
