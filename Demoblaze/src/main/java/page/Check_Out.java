package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_Out {
	
	private static WebElement element = null;
	
	
	public static WebElement Cart_Button(WebDriver driver) {
		
		element = driver.findElement(By.id("cartur"));
		return element;
	}
	
	public static WebElement Place_Order(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
		return element;
	}
	public static WebElement Name(WebDriver driver) {
		
		element = driver.findElement(By.id("name"));
		return element;
	}
	public static WebElement Country(WebDriver driver) {
		
		element = driver.findElement(By.id("country"));
		return element;
	}
	public static WebElement City(WebDriver driver) {
		
		element = driver.findElement(By.id("city"));
		return element;
	}
	public static WebElement Credit_Card(WebDriver driver) {
		
		element = driver.findElement(By.id("card"));
		return element;
	}
	public static WebElement Month(WebDriver driver) {
		
		element = driver.findElement(By.id("month"));
		return element;
	}
	public static WebElement Year(WebDriver driver) {
		
		element = driver.findElement(By.id("year"));
		return element;
	}
	public static WebElement Purchase_Button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		return element;
	}
	public static WebElement Ok_Button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"));
		return element;
	}
}
