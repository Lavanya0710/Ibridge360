package StepDefitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Rightclick {

	@Given("Launch the jQuery-contextMenu application")
	public void launch_the_j_query_context_menu_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//Right click
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); 

	}
}