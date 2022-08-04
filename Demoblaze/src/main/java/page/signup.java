package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup {
	
	private static WebElement element = null;
	
	public static WebElement signup_button(WebDriver driver) {
		
		element = driver.findElement(By.id("signin2"));
		return element;
	}

	public static WebElement user_name(WebDriver driver) {
		
		element = driver.findElement(By.id("sign-username"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		
		element = driver.findElement(By.id("sign-password"));
		return element;
	}
	
	public static WebElement Signup_click(WebDriver driver) {
		//testing
		element = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
		return element;
	}
}