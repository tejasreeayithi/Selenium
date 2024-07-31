package amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Thread.sleep(4000);
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	    logo.click();
	
	    /*WebElement address=driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
	    address.click();
	    System.out.println("address");*/
	
		/*WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    account.click();
		System.out.println("account");*/
	
	   /* WebElement returns=driver.findElement(By.xpath("//a[@id='nav-orders']"));
	    returns.click();*/
	    
	    WebElement timer=driver.findElement(By.xpath("//div[@id='hveNavSwmCountdownWidget-ccc98a9e-0ffa-4368-83f0-81e0fca788ec-internal']"));
	    timer.click();
	    
	    @SuppressWarnings("unused")
		String parent=driver.getWindowHandle();
	    WebElement sigg=driver.findElement(By.xpath("//span[text()='Sign in to join Prime']"));
	    sigg.click();
	    
	    Set<String> child=driver.getWindowHandles();
	    System.out.println(child);
	    
	    for(String childwindow:child) {
	    	if(!childwindow.equals(parent)) {
	    		driver.switchTo().window(childwindow);
	    		Thread.sleep(6000);
	    		driver.get(
	    				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    		WebElement sigma=driver.findElement(By.xpath("//span[text()='Sign in to join Prime']"));
	    		sigma.click();
	    	}
	    }
	
	
	
	
	}

}
