package selenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import org.apache.commons.io.FileUtils;
public class Section14 {
	public static void main(String[] args) throws InterruptedException, IOException {
//		 
		WebDriver driver=new ChromeDriver();
//		driver.get("http://qaclickacademy.com/practice.php");
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("D://screenshot.png"));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> url=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		//SoftAssert a=new SoftAssert();
		for(WebElement links:url) {
			String data=links.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(data).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int code=conn.getResponseCode();
			System.out.println(code);

			//org.testng.Assert.assertTrue(code<400, "The link with Text"+links.getText()+" is broken with code" +code);
			org.testng.Assert.assertFalse(code>400, "The link with Text"+links.getText()+" is broken with code" +code);
			
		}
		
		
	}
}
