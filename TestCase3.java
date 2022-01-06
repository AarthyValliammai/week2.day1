package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AARTHY");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("v");
	    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dd =new Select(source);
	    dd.selectByIndex(6);
	    WebElement marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select mc=new Select(marketingCampaignId);
	    mc.selectByVisibleText("Automobile");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aarthy");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Valli");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/18/2000");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LEARN");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SELENIUM");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20000500000000");
	    WebElement currencyUomId = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    Select currency=new Select(currencyUomId);
	    currency.selectByVisibleText("INR-Indian Rupee");
	    WebElement industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select industry=new Select(industryEnumId);
	    industry.selectByVisibleText("Finance");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
	    WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select ownership=new Select(ownershipEnumId);
	    ownership.selectByIndex(2);
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("five");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("hi@");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("easy selenium");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("practice");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("601301");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8746765390");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Aarthy");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarthyvalli@gmail.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Aarthy");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("valli");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("D9");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("CRYSTAL PARK");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CHENNAI");
	    WebElement generalStateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select gspg =new Select(generalStateProvinceGeoId);
	    gspg.selectByIndex(0);
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6");
	    WebElement generalCountryGeoId = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select country =new Select(generalCountryGeoId);
	    country.selectByVisibleText("INDIA");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
