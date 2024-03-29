package week3.day2.homeassignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-')]")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);
		WebElement founditem = driver.findElement(By.xpath("//strong[text()=' Items Found']"));
		System.out.print("Count Of The Items Found:" +founditem.getText());
		System.out.println(" ");
		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement names : brandname) {
			String listname = names.getText();
			//List<String> listnew = new ArrayList<String>();
			//listnew.add(listname);
			System.out.println("Brand Name Of The Products :" +listname);
			
		}
		System.out.println(" ");
		
		List<WebElement> bagname = driver.findElements(By.className("nameCls"));
		for (WebElement name : bagname) {
			String bagnamelist = name.getText();
			System.out.println("Bag Names:" +bagnamelist);
		}
	}
}
