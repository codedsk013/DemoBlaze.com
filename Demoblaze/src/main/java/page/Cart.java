package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	private static WebElement element = null;
	
	public static WebElement Product_Select(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
		return element;
	}
	
	public static WebElement Add_Cart(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
		return element;
	}
}
