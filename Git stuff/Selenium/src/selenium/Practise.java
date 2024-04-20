package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//	     Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_Govt")).isSelected());
//	     driver.findElement(By.id("ctl00_mainContent_chk_Govt")).click();
//	     Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_Govt")).isSelected());
//	     Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),7);
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.findElement(By.id("autosuggest")).sendKeys("ind");	     
	     Thread.sleep(2000);
	     List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	     for(WebElement option:options)
	     {
	    	 if(option.getText().equalsIgnoreCase("indonesia")){
	    		 option.click();
	    		 break;
	    	 }
	    	 }
	  }
	}


