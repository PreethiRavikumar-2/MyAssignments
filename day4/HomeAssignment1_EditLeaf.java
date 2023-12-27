package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment1_EditLeaf {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/");

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to get the current window title		
		String title = driver.getTitle();
		System.out.println(title);

		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//click Login Button
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();

		//click CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//click leads button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//	Click on Create Lead.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		//	- Enter the CompanyName Field 		
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");

		//	- Enter the FirstName Field 		
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Preethi");

		//	- Enter the LastName Field 
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Kaliraj");

		//	- Enter the FirstName (Local) Field 
		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("Pree");
		
		//	- Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[contains(@name,'departmentName')]")).sendKeys("IT");
		
		//	- Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Great");
		
		//	- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("pree@gmail.com");
		
		//	- Select State/Province as NewYork Using Visible Text.
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(state);
		sec.selectByVisibleText("New York");
		Thread.sleep(2000);
		
		//	- Click on the Create Button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(10000);
		
		//	- Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
		
		//	- Clear the Description Field.
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).clear();
		
		//	- Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[contains(@name,'importantNote')]")).sendKeys("Important");
		
		//	- Click on the update button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(5000);
		
		//	- Get the Title of the Resulting Page.
		System.out.println(driver.getTitle());
		
		//	- Close the browser window
		driver.close();

	}

}
