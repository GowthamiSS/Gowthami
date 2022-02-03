package week2.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gowthami");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		WebElement s = driver.findElement(By.xpath("//select[@id ='createLeadForm_dataSourceId']"));
		Select dropdown = new Select(s);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gowthami");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("SS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Ms");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("09/13/90");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Title11");
		driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("20,00,00,000");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("27");
		driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("43");
		//driver.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("Leads creating");
		//driver.findElement(By.xpath("//input[@id='createLeadForm_importantNote']")).sendKeys("Note 1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("56");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("s.gowthami35@yahoo.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9688092606");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("Gowthami");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("www.testleaf.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Gowthami");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("SS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Line1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("Line2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Erode");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("638109");
		WebElement State = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdown1 = new Select(State);
		dropdown1.selectByValue("CA");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("109");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(3000);
		String T = driver.getTitle();
		System.out.println("The Title is " +T);
		String FN = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getText();
		System.out.println("The First Name is: " + FN);
		
		
	}

}
