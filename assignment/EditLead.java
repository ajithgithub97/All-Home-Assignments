package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ajith");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("ajith");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("kumar");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithkumar@gmail.com");
 	WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select sec = new Select(state);
	sec.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_description"));
	Actions actions = new Actions(driver);
	actions.click(driver.findElement(By.id("updateLeadForm_description")))
	.keyDown(Keys.CONTROL)
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.sendKeys(Keys.BACK_SPACE)
	.build()
	.perform();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation Testing Done");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	System.out.println(driver.getTitle());
	driver.close();
	
			}
}
