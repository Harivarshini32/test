package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Cart {

		

			public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

			  WebDriver driver =new ChromeDriver();
          
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");
            Thread.sleep(3000L);
			driver.manage().window().maximize();
            String[] productname={"Cucumber","Onion"};
           List<String> name=Arrays.asList(productname);
            
           List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
           List<WebElement> buttons=driver.findElements(By.xpath("//div[@class='product-action']/button"));
           String[] items;
           String result;
           int j=0;
           for(int i=0;i<products.size();i++) {

        	   items=products.get(i).getText().split("-");
        	   result=items[0].trim();
  
        	   if(name.contains(result)) {
        		   j++;
        		   buttons.get(i).click();
        		   Thread.sleep(2000L);
        		   if(j==(productname.length)) {
        			   break;
        		   }
        	   }
        	   
			}
           driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        
           driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();


           

	}
		}


