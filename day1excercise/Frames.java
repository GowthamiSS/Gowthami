package week4.day1excercise;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.switchTo().parentFrame();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		int size1 = list.size();
		System.out.println("Size of the list is: " + size1);
		// File source = bt.getScreenshotAs(OutputType.FILE);

	}

}
