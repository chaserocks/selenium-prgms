package Aug25;

public class Eg4excptnhndlng {


	public static void main(String[] args) {
		
		System.out.println("selenium");
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Soapui");
	}

}
