package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement seah = driver.findElement(By.id("twotabsearchtextbox"));
		seah.sendKeys("harrypotter books");

	}

}
