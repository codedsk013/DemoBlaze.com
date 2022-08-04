package DemoBlaze.Demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.signup;

import page.Cart;

import page.Check_Out;
public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	 //Browser launcher
		System.setProperty("webdriver.chrome.driver", "E:\\Scripts\\Selenium\\Library/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hamza  Sultani\\Downloads\\geckodriver-v0.31.0-win64 (1)/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		String baseURL = "https://www.demoblaze.com" ;
		
		//URL launcher
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
//		//Product add Cart
//		Cart.Product_Select(driver).click();
//		Thread.sleep(2000);
//		Cart.Add_Cart(driver).click();
//		Thread.sleep(2000);
//		driver.getPageSource().contains("Product added");
//		Thread.sleep(2000);
		
		
		//Check_Out
		Check_Out.Cart_Button(driver).click();
		Thread.sleep(1000);
		Check_Out.Place_Order(driver).click();
		Thread.sleep(1000);
		Check_Out.Name(driver).sendKeys("Hamza");
		Thread.sleep(1000);
		Check_Out.Country(driver).sendKeys("XYZ");
		Thread.sleep(1000);
		Check_Out.City(driver).sendKeys("xyz");
		Thread.sleep(1000);
		Check_Out.Credit_Card(driver).sendKeys("4111111111111111");
		Thread.sleep(1000);
		Check_Out.Month(driver).sendKeys("January");
		Thread.sleep(1000);
		Check_Out.Year(driver).sendKeys("2xxx");
		Thread.sleep(1000);
		Check_Out.Purchase_Button(driver).click();
		Thread.sleep(5000);
		Check_Out.Ok_Button(driver).click();
		Thread.sleep(3000);
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(100,200)");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
//		Thread.sleep(2000);
//	
//		js.executeScript("window.scrollBy(200,400)");
//		Thread.sleep(2000);
		
		//Sign up
//		signup.signup_button(driver).click();
//	
//		signup.user_name(driver).sendKeys("Hamza1");
//
//		signup.password(driver).sendKeys("hamza1");
//		
//		signup.Signup_click(driver).click();
//		
//		driver.getPageSource().contains("This user already exist.");
		

		driver.close();
		//faahd testing
    }
}
