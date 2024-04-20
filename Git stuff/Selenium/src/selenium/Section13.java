package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section13 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,500)");
		Thread.sleep(3000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> total=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum=0;
		for(int i=0;i<total.size();i++) {
			
			sum=sum+Integer.parseInt(total.get(i).getText());
		}
		System.out.println(sum);
		
		
		
	}

}
