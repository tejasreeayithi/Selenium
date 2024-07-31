package Netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ats {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.netflix.com/");
		  
		  WebElement logo=driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']"));
		  logo.click();
		  System.out.println("logo");
		
		  Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=':R5ajalalbd:']")));
		  dropdown.selectByValue("en-IN");
		  System.out.println("Language");
		  
		  WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
		  mail.sendKeys("ayithitejasree@gmail.com");
		  System.out.println("mail");
		  
		  WebElement signin=driver.findElement(By.xpath("//a[text()='Sign In']"));
		  signin.click();
		  System.out.println("sign-in");
		  
		  WebElement email=driver.findElement(By.xpath("//input[@id=':r0:']"));
		  email.sendKeys("srinivasnaidu@gmail.com");
		  System.out.println("email");
		  
		  WebElement password=driver.findElement(By.xpath("//input[@id=':r3:']"));
		  password.sendKeys("Srinivas@143");
		  System.out.println("password");
		  
		  WebElement button=driver.findElement(By.xpath("//button[@data-uia='login-submit-button']"));
		  button.click();
		  System.out.println("button");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
