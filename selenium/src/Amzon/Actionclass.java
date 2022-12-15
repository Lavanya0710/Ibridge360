package Amzon;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	
	public static void main(String[] args) throws InterruptedException {
		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Actions actions = new Actions(driver);
		driver.manage().window().maximize();