
public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, num = 0;
		String prime_numbers = "";
		for(i = 20 ; i<= 100; i++)
		{
			int counter = 0;
			for (num=i; num>=1; num--)
			{
				if (i%num == 0)
				{
					counter = counter + 1;
				}
			}
			if (counter==2)
			{
				prime_numbers = prime_numbers + i + " ";
			}
		}
		System.out.println("Prime numbers betweeen 20 and 100:");
		System.out.println(prime_numbers);
		
		

	}

}
