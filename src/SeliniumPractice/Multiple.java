package SeliniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		
		// Bootstrap
		WebElement log1 = driver.findElement(By.xpath("//a[text()='Bootstrap Dropdown Example for Selenium']"));
		log1.click();

		WebElement clc = driver.findElement(By.className("caret"));
		clc.click();
		System.out.println("dropdown");

		WebElement cs = driver.findElement(By.xpath("//a[text()='CSS']"));
		cs.click();
		System.out.println("css");

		
		// Autocomplete Handling
		WebElement li = driver
				.findElement(By.xpath("//a[text()='How to handle autocomplete feature in Selenium Web...']"));
		li.click();

		WebElement tg = driver.findElement(By.className("ui-autocomplete-input"));
		tg.sendKeys("Java");
		System.out.println("Java");

		
		// Date
		WebElement lk = driver.findElement(By.xpath("//a[text()='How to handle calendar in Selenium Webdriver']"));
		lk.click();

		WebElement log = driver.findElement(By.xpath("//input[@id='datepicker']"));
		log.sendKeys("12/08/2025");
		log.sendKeys(Keys.ENTER);

		
		// RadioButton
		WebElement bt = driver
				.findElement(By.xpath("//a[text()='How to automate radio button in Selenium Webdriver']"));
		bt.click();

		WebElement rd = driver.findElement(By.xpath("//input[@id='female']"));
		rd.click();

		WebElement ri = driver.findElement(By.xpath("//input[@id='java']"));
		ri.click();

		WebElement ro = driver.findElement(By.xpath("//input[@id='sing']"));
		ro.click();

		
		// Automate tooltip
		WebElement tt = driver.findElement(By.xpath("//a[text()='How to automate tooltip in Selenium webdriver']"));
		tt.click();

		WebElement tl = driver.findElement(By.xpath("//div[@class='tooltip']"));
		tl.click();
		

		// Wait
		WebElement lk1 = driver.findElement(By.xpath("//a[text()='How to use explicit wait in Selenium']"));
		lk1.click();

		WebElement ti = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		ti.click();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		@SuppressWarnings("unused")
		WebElement teju=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		System.out.println("arjun");
		
		
		// Mouse hover
				WebElement hh = driver.findElement(By.xpath("//a[text()='How to perform mouse hover in Selenium Webdriver']"));
				hh.click();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				WebElement tx = driver.findElement(By.xpath("//textarea[@rows='10']"));
				tx.sendKeys("How to perform mouse hover in SELENIUM WEBDRIVER using automation Tools.");
				 Actions act=new Actions(driver);
				 act.moveToElement(tx).build().perform();
				 WebElement ya=driver.findElement(By.xpath("//a[text()='Selenium']"));
				ya.click();
	}

}
