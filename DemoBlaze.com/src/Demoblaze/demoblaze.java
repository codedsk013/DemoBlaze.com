package Demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser launcher
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hamza  Sultani\\Desktop\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hamza  Sultani\\Downloads\\geckodriver-v0.31.0-win64 (1)/geckodriver.exe");
				//WebDriver driver = new ChromeDriver();
				WebDriver driver = new FirefoxDriver();
				
				//URL launcher
				driver.get("https://www.demoblaze.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,100)");
				Thread.sleep(1000);
				js.executeScript("window.scrollBy(100,200)");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
				Thread.sleep(2000);
			
				js.executeScript("window.scrollBy(200,400)");
				Thread.sleep(2000);
				
				
				
				driver.close();

	}

}
