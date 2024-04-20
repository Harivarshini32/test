package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
//		   driver.get("http://qaclickacademy.com/practice.php");
//		   System.out.println(driver.findElements(By.tagName("a")).size());
//		   WebElement footer=driver.findElement(By.id("gf-BIG"));
//		   System.out.println(footer.findElements(By.tagName("a")).size());
//		   WebElement footer1=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		   System.out.println(footer1.findElements(By.tagName("a")).size());
//		   for(int i=0;i<footer1.findElements(By.tagName("a")).size();i++) {
//			   String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			   footer1.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
//		   }
//		   Set<String> abc=driver.getWindowHandles();
//		   Iterator<String> windows= abc.iterator();
//		   while(windows.hasNext())
//		   {
//			   driver.switchTo().window(windows.next());
//			   System.out.println(driver.getTitle());
//		   }
		   driver.get("https://www.path2usa.com/travel-companions");
		   driver.findElement(By.id("travel_date")).click();
		   while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr//th[@class='datepicker-switch']")).getText().contains("June 2023")) {
			   
			   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr//th[@class='next']")).click();
		   }
//		   while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
//		   {
//		   driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//		   }
		   List<WebElement> dates=driver.findElements(By.className("day"));
		  int count =driver.findElements(By.className("day")).size();
		   
		   for(int i=0;i<count;i++) {
			   String text=driver.findElements(By.className("day")).get(i).getText();
			   if(text.equalsIgnoreCase("29"))
			   {
				   driver.findElements(By.className("day")).get(i).click();
				   break;
			   }
		   }
		   
		   
	}

}
