package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://qaclickacademy.com/practice.php");
		   driver.findElement(By.id("checkBoxOption3")).click();
		   String opt3= driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[3]")).getText();
		   WebElement ans=driver.findElement(By.id("dropdown-class-example"));
		   Select dropdown=new Select(ans);
		   dropdown.selectByVisibleText(opt3);
		   driver.findElement(By.name("enter-name")).sendKeys(opt3);
		   driver.findElement(By.id("alertbtn")).click();
           String text=driver.switchTo().alert().getText();
           if(text.contains(opt3)) {
        	   System.out.println("success");
           }
           else
           {
        	   System.out.println("failure");
           }
	}

}
