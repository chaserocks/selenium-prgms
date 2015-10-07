package JavaPrgms;

public class MethodOverloading {

//	public static void sumAll(int a,int b)
	//{
		//System.out.println(a+b);
	//}
	//public static void sumAll(double a,double b)
	//{
	//	System.out.println(a+b);
	//}
	
//	public static void sumAll(String a,String b)
	//{
		//System.out.println(a+b);
	//}
	
//	public static void main(String[] args) {
		
	//	sumAll(10,20);
		//sumAll(10.23,20.32);
		//sumAll("Hai","Selenium");
	//}

//}
//or else with out the method overloading concept.

public static void sumAll(int a,int b)
{
	System.out.println(a+b);
}
public static void dblAll(double a,double b)
{
	System.out.println(a+b);
}

public static void strAll(String a,String b)
{
	System.out.println(a+b);
}

public static void main(String[] args) {
	
	sumAll(10,20);
	dblAll(10.23,20.32);
	strAll("Hai","Selenium");
}

}










