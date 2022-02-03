package week4.day1excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a/img")).click();
		String merge = driver.getWindowHandle();
		System.out.println(merge);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		String C = windows.get(1);
		System.out.println(C);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a)[1]")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		String cw1 = windows1.get(1);
		driver.switchTo().window(cw1);
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a)[2]"))
				.click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
