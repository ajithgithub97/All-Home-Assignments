package week4.day1.homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonAutomation {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String priceoffirstproduct = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("First Product Price:" +priceoffirstproduct);
		String cusrating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Customer Rating:" +cusrating);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		//	 System.out.println(windowhandles.size());
		List<String> handlelist =new ArrayList<>(windowhandles);
		driver.switchTo().window(handlelist.get(1));
		//System.out.println(driver.getTitle());
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps1/Screenshot.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-price')])[1]")).getText();

		System.out.println("Sub Total:" +subtotal);

		driver.quit();
	}
}
