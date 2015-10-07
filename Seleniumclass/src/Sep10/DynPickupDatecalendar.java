package Sep10;
//Prgm to pickup a date from the calendar.
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynPickupDatecalendar {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
	}
	@Test
		public void dynwebtableTest()
	{
	 //class of one way radio button.
		driver.findElement(By.className("radio_state")).click();
		//id of from i/p field
		driver.findElement(By.id("from_typeahead1")).sendKeys("New Delhi, India (DEL)");
		//id of to i/p field
		driver.findElement(By.id("to_typeahead1")).sendKeys("Bangalore, India (BLR)");
		//xpath of the calendar icon
		driver.findElement(By.xpath("//*[@id='start_date_sec']/span[2]")).click();
		//Date of journey
		String doj="23/06/2016";
		String[] a=doj.split("/");
		String [] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String day=a[0];
		String year=a[2];
		//Class of the year on left side calendar.
		String calyear=driver.findElementByClassName("ui-datepicker-year").getText();
		//Loop to search for the required year
		while(!calyear.equals(year))
		{
			//xpath of the arrow icon on the right side calendar
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
			//class of the year on the left side calendar
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			//class of the month on the left side calendar
			String calmonth=driver.findElementByClassName("ui-datepicker-month").getText();
			//Loop to search for the required year
			while(!calmonth.equals(month))
			{
				//xpath of the arrow icon on the right side calendar
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
				//class of the year on the left side calendar
				calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				//xpath of the entire left side calendar.
				WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
				List <WebElement> rows=table.findElements(By.tagName("tr"));
				boolean flag=false;
				for(int i=0;i<rows.size();i++)
				{
					List <WebElement> cols=rows.get(i).findElements(By.tagName("td"));
					for(int j=0;j<cols.size();j++)
					{
						if(cols.get(i).getText().equals(day))
						{
							cols.get(i).click();
							flag=true;
							break;
						}
					}
					if(flag==true)
					{
						break;
					}
				}
			}
		}
	}
}
					
