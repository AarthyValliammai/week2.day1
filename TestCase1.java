package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Aarthy");
	    driver.findElement(By.id("lastNameField")).sendKeys("V");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
