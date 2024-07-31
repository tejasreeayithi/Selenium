package DemoSite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		//SIMPLE_ALERTS
		WebElement simple = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		simple.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();

		//CONFIRMATION_ALERTS_ACCEPTED
		WebElement conf = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		conf.click();
		WebElement button = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		button.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		WebElement Message=driver.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println(Message.getText());

		//CONFIRMATION_ALERTS_DISSMISSSED
		WebElement conf1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		conf1.click();
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		button1.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		WebElement SuccessMessage=driver.findElement(By.id("demo"));
		System.out.println(SuccessMessage.getText());
		
		//PROMT_ALERT
		WebElement prom=driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		prom.click();
		WebElement clc=driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		clc.click();
	    Alert clc1=driver.switchTo().alert();		
	    clc1.sendKeys("Tejasree Ayithi");
	    Thread.sleep(4000);
	    clc1.accept();
	    WebElement Succ=driver.findElement(By.id("demo1"));
		System.out.println(Succ.getText());
		Thread.sleep(5000);
		driver.close();

	}

}
