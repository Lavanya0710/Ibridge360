package StepDefitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Doubleclick {
	@Given("Launch the jQuery-contextMenu application for Double click")
	public void launch_the_j_query_context_menu_application_for_double_click() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//DoubleClick method
		driver.switchTo().frame(0);
		
		
	}


}
