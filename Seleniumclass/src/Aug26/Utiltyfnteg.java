package Aug26;
// Random functn will capture any value from 0 to 100 .
public class Utiltyfnteg {

	
	public static void main(String[] args) 
	{
		MyRandomNo();
	}
	public static void MyRandomNo()
	{
		double d=Math.random()*100;
		int a=(int)d;
		System.out.println(a);
	}
}
