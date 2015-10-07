package JavaPrgms;
//Inheritance: One Class acquiring the properties of the another class.
// Here the InherAudi is a parent class is calling the sub class InherCar(another class).
public class InherAudi extends InherCar {
	String model;
	public void Acceleration()
	{
		System.out.println("Car Acceleration");
    }
	
	public static void main(String[] args) {
		InherAudi a= new InherAudi();
		a.model="Audi A6-Matrix";
        a.Acceleration();
		a.price=9999;
		a.Start();
		{
			System.out.println(a.model);
		}
	}

}
