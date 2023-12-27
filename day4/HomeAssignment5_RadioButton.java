package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment5_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.leafground.com/radio.xhtml");

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to get the current window title		
		System.out.println(driver.getTitle());

//		Handle Radio Button
//		Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton-icon ui-icon ui-icon-blank ui-c')])[9]")).click();
		
//		- Click on a radio button, then click on the same radio button again to verify that 
//		it becomes ‘unselected’.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton-icon ui-icon ui-icon-blank ui-c')])[9]")).click();
		
//		- Identify the radio button that is initially selected by default.
		Thread.sleep(2000);
		boolean selected = driver.findElement(By.xpath("(//table[@role='presentation']//span)[18]")).isSelected();
		System.out.println("Is Selected by default: " + selected);
		

//		- Check and select the age group (21-40 Years) if not already selected.
		Thread.sleep(2000);
		boolean ageIsSelected = driver.findElement(By.xpath("//span[contains(@class,'ui-radiobutton-icon ui-icon ui-c ui-icon-bullet')]")).isSelected();

		if(!ageIsSelected)
		{
			driver.findElement(By.xpath("//span[contains(@class,'ui-radiobutton-icon ui-icon ui-c ui-icon-bullet')]")).click();
		}
		else
		{
			System.out.println("Age is already selected");
		}
		
		//	- Close the browser window
		driver.close();

	}

}
