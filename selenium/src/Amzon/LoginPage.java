package Amzon;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginPage {

	
	public static void main(String[] args) throws InterruptedException {
		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		driver.findElement(By.name("email")).sendKeys("9535104639");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("laddu@727");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		//actions.moveByOffset(0, 100).click().build().perform();
		//actions.moveByOffset(0,100).click();
		//driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
