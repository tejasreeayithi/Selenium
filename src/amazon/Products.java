package amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement seah = driver.findElement(By.id("twotabsearchtextbox"));
		seah.sendKeys("harrypotter books");
		seah.sendKeys(Keys.ENTER);

		String parent = driver.getWindowHandle();
		WebElement boo = driver.findElement(
				By.xpath("//span[text()='Harry Potter Box Set: The Complete Collection (Children’s Paperback)']"));
		boo.click();

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String childWindow : child) {
			if (!childWindow.equals(parent)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(4000);
				WebElement buyNow = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
				buyNow.click();
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		WebElement logoBtn = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		logoBtn.click();
		Thread.sleep(4000);
		driver.quit();

		/*
		 * WebElement sea = driver.findElement(By.id("twotabsearchtextbox"));
		 * sea.sendKeys("iphone 12 pro"); sea.sendKeys(Keys.ENTER);
		 * 
		 * String parent1 = driver.getWindowHandle(); WebElement iph =
		 * driver.findElement(By.xpath(
		 * "//span[text()='Apple iPhone 12 (128GB) - Purple' and @class='a-size-medium a-color-base a-text-normal']"
		 * )); iph.click();
		 * 
		 * Set<String> child1 = driver.getWindowHandles(); System.out.println(child1);
		 * 
		 * for (String childwindow : child1) { if (!childwindow.equals(parent1)) {
		 * driver.switchTo().window(childwindow); Thread.sleep(5000); WebElement car =
		 * driver.findElement(By.xpath("//input[@id='buy-now-button']")); car.click();
		 * Thread.sleep(5000); } } driver.switchTo().window(parent); WebElement logoBtn
		 * = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		 * logoBtn.click(); Thread.sleep(4000); driver.quit();
		 * 
		 * ///////////////////////////////////////////////////////////////////////////
		 * 
		 * /* WebElement hot = driver.findElement(By.id("twotabsearchtextbox"));
		 * hot.sendKeys("women tunics western"); hot.sendKeys(Keys.ENTER);
		 * 
		 * String parent = driver.getWindowHandle(); WebElement tunic =
		 * driver.findElement(By.xpath(
		 * "//span[text()='Western Dress || Rayon Color Block Half Button Front Dress for Women || Long Cuff Sleeve & Stand Collared Neck Tunic Dress || Office || Summer Dresses for Women.']"
		 * )); tunic.click();
		 * 
		 * Set<String>child=driver.getWindowHandles(); System.out.println(child);
		 * 
		 * for(String childwindow: child) { if(!childwindow.equals(parent)) {
		 * driver.switchTo().window(childwindow); Thread.sleep(5000); WebElement
		 * ca=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 * ca.click(); Thread.sleep(5000); } } driver.switchTo().window(parent);
		 * WebElement logoBtn =
		 * driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")); logoBtn.click();
		 * Thread.sleep(4000); driver.quit();
		 */
	}
}
