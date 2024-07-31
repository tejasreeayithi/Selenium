package amazon;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		/*Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		dropdown.selectByVisibleText("Amazon Fashion");*/
		
	    Select dropdown1 = new Select (driver.findElement(By.xpath("//a[@id='nav-hamburger-menu' and @role='button']")));
	    dropdown1.selectByVisibleText("Best Sellers");
		
		
		
		

	}

}
