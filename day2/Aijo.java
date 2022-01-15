package Week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aijo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men']//following-sibling::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for = 'Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@id='products']//div[@class='length']"));
		String count = element.getText();
		System.out.println(count);
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		for (WebElement brandValue : brandList) {
			String text = brandValue.getText();
			System.out.println(text);
		}
		List<WebElement> bagList = driver.findElements(By.className("nameCls"));
		for (WebElement brandValuebag : bagList) {
			String text = brandValuebag.getText();
			System.out.println(text);
		}
	}

}
