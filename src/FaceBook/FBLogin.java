package FaceBook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
		public static void main(String[] args) {
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			
			  //e-mail
			driver.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).sendKeys("ayithitejasree@gmail.com");
			 //password.
		    WebElement password=driver.findElement(By.id("pass"));
		   password.sendKeys("teju@3122");
		    //login.
		  WebElement button=driver.findElement(By.name("login"));
		   button.click();				
						
						
						
		}
			
	}



