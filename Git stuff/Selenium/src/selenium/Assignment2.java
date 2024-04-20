package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("http://www.cleartrip.com/");
		driver.findElement(By.xpath("//button[contains(@class,'c-neutral-900')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]")).click();
		Thread.sleep(2000);
		WebElement staticdropdown=driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);

		WebElement staticdropdown2=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		Select dropdown1=new Select(staticdropdown2);
		dropdown1.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement staticdropdown3=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[3]"));
		Select dropdown3=new Select(staticdropdown3);
		dropdown3.selectByIndex(1);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='row pt-3 p-relative px-4']/div/div/a/strong")).click();
	     driver.findElement(By.xpath("//div[@class='row pt-3 p-relative px-4']/div/div/a/strong")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Indigo");
		driver.findElement(By.xpath("//div[@class='col flex flex-middle']/button")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='container p-fixed z-20 w-100p b-0 mb-2']/div/div/div/span")).getText());

//		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='container p-fixed z-20 w-100p b-0 mb-2']/div/div/div/span")).getText(), "Select Departure and Arrival airports/cities.");
		
	}

}
