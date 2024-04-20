package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.net.httpserver.Authenticator.Result;

public class Section151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
List<String> result;
		//		List<String> veg=names.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(veg);
//		List<String> sort=names.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
//		System.out.println(sort);
		do {
		List<WebElement> names=driver.findElements(By.xpath("//tr/td[1]"));
		result=names.stream().filter(f->f.getText().contains("Chocolate")).map(s->getveggie(s)).collect(Collectors.toList());
		result.forEach(s->System.out.println(s));
		if(result.size()<1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(result.size()<1);
		
	}

	private static String getveggie(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
