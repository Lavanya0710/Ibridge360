package StepDefitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Ibrige  {

	WebDriver driver=null;


	@Given("Launch the browser")
	public void launch_the_browser() {
		System.out.println("Inside Step: Launch the browser");

		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on login page")

	public void User_interface() {
		System.out.println("Inside Step: User is on login page");
		driver.navigate().to("https://learner.ibridge360.com/sign-in");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {

		System.out.println("Inside Step: User enters username and password");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step:Click on login button");
		driver.findElement(By.cssSelector("span[class='MuiButton-label']")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside Step: user is navigated to the home page");
		System.out.println("User is in home page: \n");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}



}
