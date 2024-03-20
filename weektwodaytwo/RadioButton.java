package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']//span)[9]")).click();
		Thread.sleep(2000);
		WebElement selected = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[12]"));
		selected.click();
		Thread.sleep(3000);
		WebElement unselected = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]"));
		unselected.click();
		unselected.isSelected();
		if (unselected.isSelected()) {
			System.out.println("Selected");	
		}
		else {
			System.out.println("Unselected");
		}
		boolean result = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']")).isSelected();
		System.out.println(result);
		boolean agegroup = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]")).isSelected();
		System.out.println(agegroup);

	}

}
