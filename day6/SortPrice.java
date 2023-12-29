package week3.day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortPrice {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus mobiles", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> list = new ArrayList<String>();
		for(WebElement each : allPrices) {
			String text = each.getText();
			list.add(text);
			System.out.println(text);
		}
		
		//to sort the list
		Collections.sort(list);
		System.out.println("Sorted prices: " +list);
		System.out.println("Lowest price: " +list.get(0));
		
	}

}
