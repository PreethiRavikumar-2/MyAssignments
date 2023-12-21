package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeafAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		//	- Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("MyNewLeaf");

		//	- Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		//	- Select "ComputerSoftware" as the industry.
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(industryDD);
		sec.selectByIndex(3);

		//	- Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(ownershipDD);
		sec1.selectByVisibleText("S-Corporation");

		//	- Select "Employee" as the source using SelectByValue.
		WebElement dataSourceDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(dataSourceDD);
		sec2.selectByValue("LEAD_EMPLOYEE");

		//	- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
		Select sec3 = new Select(marketingDD);
		sec3.selectByIndex(6);

		//	- Select "Texas" as the state/province using SelectByValue.
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(stateDD);
		sec4.selectByValue("TX");

		//	- Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();

		//		- Verify that the account name is displayed correctly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // correct this

		//	- Close the browser window.
		//	driver.close();


	}

}
