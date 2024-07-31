package DemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
		driver.switchTo().frame(frame);
		WebElement button=driver.findElement(By.xpath("//button[@aria-label='Play']"));
		button.click();

		
		
		
		
		
		
		
		
}
}
