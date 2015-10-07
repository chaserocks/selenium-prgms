package Aug26;

import org.openqa.selenium.firefox.FirefoxDriver;

// Prgm to find the webelement of rajinikanth is present or not 
public class Webelemntprsnt {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	String str=driver.getPageSource();
	if(str.contains("Rajinikanth"))
	{
		System.out.println("Element is found");
	}
	else
	{
		System.out.println("Element is not found");
	}
	}

}
