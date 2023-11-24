public class SwappingNumbers {
	public static void main(String[] args) {
		int a = 10,b = 20, temp; // swapping with using temp variable
		System.out.println("--numbers before swapping--");
		System.out.println("first number is: " + a);
		System.out.println("second number is: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("-- numbers after swapping--");
		System.out.println("first number is: " + a);
		System.out.println("second number is: " + b);	
		// TODO Auto-generated method stub
		int c = 100, d = 200; // without using temp variable
		System.out.println("-- numbers before swapping--");
		System.out.println("first number is: " + c);
		System.out.println("Second number is: " + d);
		c = c - d;
		d = c + d;
		c = d - c;
		System.out.println("-- numbers after swapping--");
		System.out.println("first number is: " + c);
		System.out.println("Second number is: " + d);
	}
}
