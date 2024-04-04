package week4.day1.homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),' Fashion')]"));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),' Fashion')]"))).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String countofshoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count Of Shoes:"+countofshoes);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("sort-selected")).click();
		String sortlist = driver.findElement(By.xpath("//li[@data-sorttype='plth']")).getText();
		if (sortlist.contains("Price Low")) {
			System.out.println("Product Sorted");
		}
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(2000);
		WebElement sliderleft = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
		WebElement sliderright = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll right-handle')]"));
		//			 int Xpossion = sliderleft.getLocation().getX();
		//				int Ypossion= sliderright.getLocation().getY();
		//				System.out.println("Button Possions:" +Xpossion + ":" +Ypossion );
		Thread.sleep(2000);
		Actions moves = new Actions(driver);
		moves.dragAndDropBy(sliderleft, -1, 0).perform();
		Thread.sleep(1000);
		moves.dragAndDropBy(sliderright, -198, 0).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(driver.findElement(By.xpath("//img[@class='product-image wooble']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
		Thread.sleep(2000);
		String shoeprice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String shoeoffer = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Shoe Price:"+shoeprice + " " + "Shoe Offer:"+shoeoffer);
		Thread.sleep(1000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps1/Snapdeal.png");
		FileUtils.copyFile(src, dest);
		driver.close();

	}
}
