package week2.day1homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestaCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement (By.linkText("Create Contact")).click();
		driver.findElement (By.id("firstNameField")).sendKeys("Sumanth3");
		driver.findElement (By.id("lastNameField")).sendKeys("K");
		Thread.sleep(5000);
		driver.findElement (By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		System.out.println("Sumanth");		
		
	}

}
