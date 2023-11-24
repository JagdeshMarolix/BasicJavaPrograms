
public class Riding extends Driving {
	void car()
	{
		System.out.println("this is car");
	}
	
	public static void main(String[] args)
	{
		Riding rd = new Riding();
		rd.car();
		rd.bike();
	}

}
