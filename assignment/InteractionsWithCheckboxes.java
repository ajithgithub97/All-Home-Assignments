package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement expected = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String exp =expected.getText();
		System.out.println("Expected Message:"  +exp);
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		Thread.sleep(5000);
		WebElement state1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]"));
		String sta1 = state1.getText();
		WebElement state2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p[1]"));
		String sta2 = state2.getText();
		System.out.println(sta1 + "Verified State:" +sta2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();		
		WebElement message = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]"));
		String msg = message.getText();
		System.out.println("Expected msg:"+msg);
		WebElement result = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]"));
		String res = result.getText();
		System.out.println("Checkbox:"+res);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui')])[11]")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
