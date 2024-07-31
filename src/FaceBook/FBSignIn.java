package FaceBook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignIn {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/signup");
	
   //sign-up.........page


WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
firstname.sendKeys("Tejasree");

WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
lastname.sendKeys("Ayithi");

WebElement name=driver.findElement(By.xpath("//input[@name='reg_email__']"));
name.sendKeys("ayithitejasree@gmail.com");

WebElement password=driver.findElement(By.xpath("//input[@aria-label='New password']"));
password.sendKeys("teja@3122");

WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
gender.click();

Select dropdown=new Select(driver.findElement(By.id("day")));
dropdown.selectByValue("3");

Select dropdown1=new Select(driver.findElement(By.id("month")));
dropdown1.selectByVisibleText("Dec");

Select dropdown2=new Select(driver.findElement(By.id("year")));
dropdown2.selectByValue("2002");

WebElement rear=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
rear.sendKeys("ayithitejasree@gmail.com");


}
}




