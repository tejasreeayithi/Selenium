package DemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement file=driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Program Files\\Intel\\Media SDK");

		WebElement chbx=driver.findElement(By.xpath("//input[@id=\"terms\"]"));
		chbx.click();
		
		WebElement sub=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		sub.click();
	}

}
