package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass4 {
	public static void main(String[] args) {

		   System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		   driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		   Set<String> window=driver.getWindowHandles();
		   Iterator<String> it=window.iterator();
		   String parent=it.next();
		   String child=it.next();
		   driver.switchTo().window(child);
		   System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		   driver.switchTo().window(parent);
		   System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		   
	}

}
