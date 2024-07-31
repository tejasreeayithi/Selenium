package Flipkart;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Kart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
		 WebElement logo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		  logo.click();
		  System.out.println("logo");
		  
		  WebElement mbl=driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
		  mbl.sendKeys("9059769973");
		  System.out.println("mobile number");
		  
		  WebElement req=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		  req.click();
		  System.out.println("req");
		  
		  WebElement search=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		  search.sendKeys("moto 5g mobile");
		  search.sendKeys(Keys.ENTER);
		  System.out.println("mobile");
		  String parent=driver.getWindowHandle();
		  WebElement pho=driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']"));
		  pho.click();
		  Set<String>child=driver.getWindowHandles();
		  System.out.println("child");
		  for(String childWindow: child) { if(!childWindow.equals(parent)) {
			  driver.switchTo().window(childWindow); Thread.sleep(4000); WebElement
			  buyNow=driver.findElement(By.xpath("//span[text()='Add 3 Items to Cart']"));
			  buyNow.click(); Thread.sleep(4000); driver.close(); } }
		  System.out.println("Added to cart");
		  driver.switchTo().window(parent);
		  WebElement lo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		  lo.click();
		  WebElement into=driver.findElement(By.xpath("//span[@role=\"button\"]"));
		  into.click();
		  
		
		  
		  
		

	}

}
