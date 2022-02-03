package week2.excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("GG");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("9807854890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Gowth@1999");
		WebElement date = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select d = new Select(date);
		d.selectByValue("13");
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select m = new Select(month);
		m.selectByVisibleText("Sep");
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y = new Select(year);
		y.selectByVisibleText("1990");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();

	}

}
