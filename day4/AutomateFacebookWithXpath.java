package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookWithXpath {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
		System.out.println(driver.getTitle());
		
//		driver.close();
	}

}
