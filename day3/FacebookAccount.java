package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.partialLinkText("Create new account")).click();

		/*
		 * Enter the First name. - Enter the Surname. - Enter the Mobile number or email
		 * address. - Enter the New password. - Handle all three dropdowns in Date of
		 * birth - Select the radio button in Gender
		 */

		driver.findElement(By.name("firstname")).sendKeys("Vedhikh");
		driver.findElement(By.name("lastname")).sendKeys("Kaliraj");
		driver.findElement(By.name("reg_email__")).sendKeys("9087665443"); // accepts special characters working with special characters, not accepts numberic values only
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vedhikh@04");

		WebElement day = driver.findElement(By.id("day"));
		Select sec1 = new Select(day);
		sec1.selectByIndex(3);

		WebElement month = driver.findElement(By.id("month"));
		Select sec2 = new Select(month);
		sec2.selectByVisibleText("Sep");

		WebElement year = driver.findElement(By.id("year"));
		Select sec3 = new Select(year);
		sec3.selectByValue("2018");

		driver.findElement(By.xpath("//label[text()='Male']")).click();


	}

}
