package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LeafgroundButtonInteraction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement Result = driver.findElement(By.xpath("//span[text()='Disabled']"));
		System.out.println(Result.getText());
		WebElement button = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		int Xpossion = button.getLocation().getX();
		int Ypossion= button.getLocation().getY();
		System.out.println("Button Possions:" +Xpossion + ":" +Ypossion );
		WebElement buttoncolor = driver.findElement(By.xpath("//span[text()='Save']"));
		String backgroundcolor = buttoncolor.getCssValue("background");
		System.out.println("Backgroung Color:"+backgroundcolor);
		WebElement size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("Button Height:"+size.getSize().getHeight());
		System.out.println("Button Width:"+size.getSize().getWidth());
		driver.close();
	}

}
