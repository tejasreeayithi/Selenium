package DemoSite;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		WebElement Drag = driver.findElement(By.id("fourth")); // 5000
		WebElement Drop = driver.findElement(By.id("amt7")); // placeholder

		Actions action = new Actions(driver);

		action.dragAndDrop(Drag, Drop).build().perform();

		WebElement drag = driver.findElement(By.id("credit2")); // -5000
		WebElement drop = driver.findElement(By.id("bank")); // placeholder

		Actions action1 = new Actions(driver);
		action1.dragAndDrop(drag, drop).build().perform();

	}

}
