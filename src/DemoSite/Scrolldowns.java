package DemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement msg=driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",msg) ;
		msg.click();


	}

}
