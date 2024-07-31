package DemoSite;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> NoRows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("The Size of Row is="+" "+NoRows.size());
		
		List<WebElement>NoColomns=driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("The size of colomn is="+" "+ NoColomns.size());
		
		String company="Ernst Handel";
		
		WebElement company1=driver.findElement(By.xpath("//td[text()='"+company+"']"));
		System.out.println("The name of the company is="+" "+company1.getText());
		WebElement contact=driver.findElement(By.xpath("//td[text()='"+company+"']/following::td[1]"));
		System.out.println("The contact person name is="+" "+contact.getText());
		
		WebElement country=driver.findElement(By.xpath("//td[text()='"+company+"']/following::td[2]"));
		System.out.println("The country is="+" "+country.getText());
	
	
	
	}

}
