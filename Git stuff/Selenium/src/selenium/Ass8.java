package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("dom");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		//get attribute is used to get the value present inside the edit box
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
	}

}
