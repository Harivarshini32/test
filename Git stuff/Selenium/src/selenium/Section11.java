package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Section11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//	   System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//	   Actions a=new Actions(driver);
//		
//		//moves to specific element
//     	a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("djdy").doubleClick().build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"))).build().perform();
//	
		//window handling 
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();		
		driver1.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
	    driver1.findElement(By.cssSelector("a.blinkingText")).click();
	    
	    Set<String> window=driver1.getWindowHandles();
	    
	    Iterator<String> it=window.iterator();
	     
	    String parent=it.next();
	    String child=it.next();
	    
	    driver1.switchTo().window(child);
	    System.out.println(driver1.findElement(By.cssSelector("p.im-para.red")).getText());
	   String email= driver1.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   
	   driver1.switchTo().window(parent);
	   driver1.findElement(By.id("username")).sendKeys(email);
	   
//		driver.get("http://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		driver.switchTo().frame(0);
//		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//		driver.findElement(By.id("draggable")).click();
//	   Actions a=new Actions(driver);
//	   WebElement drag=driver.findElement(By.id("draggable"));
//	   WebElement drop=driver.findElement(By.id("droppable"));
//	   
//	   a.dragAndDrop(drag,drop).build().perform();
//	  
//	    
//		
//		
//		
	}
//
}
