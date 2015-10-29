package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;
//thisi is for test 
	// Driver is being passed as an Argument so that Selenium is able to locate
	// the element on the browser (driver).

	// Element is returned, so that an Action can be performed on it.

	// Method is declared as Public Static, so that it can be called in any
	// other method without instantiate the class.

	public static WebElement lnk_MyAccount(WebDriver driver) {

		element = driver.findElement(By.className("account_icon"));

		return element;

	}

	public static WebElement lnk_LogOut(WebDriver driver) {

		element = driver.findElement(By.id("account_logout"));

		return element;

	}

}





