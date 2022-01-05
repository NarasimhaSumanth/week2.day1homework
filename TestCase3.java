package week2.day1homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Legato2");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumanth2");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(dd1);

		dropdown1.selectByIndex(1);

		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("9002");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("19/07/92");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000$");
		WebElement dd3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue("CAD");

		WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByVisibleText("Computer Software");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");

		WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByVisibleText("Corporation");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9052787001");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sumanth123@gmail.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sumanth");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("gachibowli");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("hyderabad");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("500019");

		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(dd7);
		dropdown7.selectByValue("IND");

		// WebElement dd6 = driver.findElement(By.id("generalStateProvinceGeoId"));
		// Select dropdown6 = new Select(dd6);
		// dropdown6.selectByIndex(2);

		 WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
				String name = firstname.getAttribute("name");
				
				System.out.println(name);

		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);

		String pagetitle = driver.getTitle();
		
		System.out.println(pagetitle);

		if (pagetitle.contains("View Lead")) {

			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

	}

}
