package Aug25;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

// Prgm to launch gmail and to capture the current url using HTML Driver.
public class Rhino {

	public static void main(String[] args) { // require net connection to display current title & url.
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
