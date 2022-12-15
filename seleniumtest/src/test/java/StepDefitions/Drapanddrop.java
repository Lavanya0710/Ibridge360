package StepDefitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class Drapanddrop {
	
	
	@Given("Launch the Automation Testing Practice")
	public void launch_the_automation_testing_practice() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//Drag and drop
		WebElement src1=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement tag1=driver.findElement(By.cssSelector("div[id='droppable']"));
		act.dragAndDrop(src1,tag1).perform();
		
		
		
	}
	    

}




