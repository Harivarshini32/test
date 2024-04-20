package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		String[] addItem = {"Potato", "Cauliflower", "Onion", "Tomato"};

		List<String> addItemList = Arrays.asList(addItem);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		String[] productArray;

		String product;

		int j = 0;

		for(int i = 1;i<products.size();i++) {

		productArray = products.get(i).getText().split("-");

		product = productArray[0].trim();

		if (addItemList.contains(product)) {

		j++;

		buttons.get(i).click();

		Thread.sleep(3000);

		if (j == (addItem.length)) {

		break;

		}

		}

		}

		//click on Cart bag

		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();

		//click on Proceed to checkout

		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		
		WebDriverWait w=new WebDriverWait(driver,5);
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


		 
		
		


	}

}
