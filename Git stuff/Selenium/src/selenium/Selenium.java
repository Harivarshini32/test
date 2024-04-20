package selenium;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//     System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//     WebDriver driver=new ChromeDriver();
//     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//     driver.findElement(By.id("name")).sendKeys("varshu"); 
//
//     driver.findElement(By.id("alertbtn")).click();
//     System.out.println( driver.switchTo().alert().getText());
//     driver.switchTo().alert().accept();
     
//     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
//     driver.findElement(By.xpath("//option[@value='KQH']")).click();
//     Thread.sleep(2000);
//     driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
//     driver.findElement(By.xpath("(//option[@value='CJB'])[2]")).click();
//     Thread.sleep(2000);
//      driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//     Thread.sleep(3000);
//     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
//    	System.out.println("it is enabled");
//    }
//    else {
//    	 System.out.println("it is disabled");
//    }
		  System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		     //getting all the products name
		     Thread.sleep(2000L);
		     String[] items={"Cucumber","Beetroot"};
		    List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		    System.out.println(products);
		    for(int i=0;i<products.size();i++){
		    
		     String[] name=products.get(i).getText().split("-");
		     String formatted=name[0].trim();
	           //convert array into array list for easy search	     
		     List<String> need=Arrays.asList(items);
		     int j=0;
		     if(need.contains(formatted))
		     {
		    	j++;
		    	 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		    	 if(j==items.length) {
		    		 break;
		    	 }
		     }

	}
     

     
}
}

