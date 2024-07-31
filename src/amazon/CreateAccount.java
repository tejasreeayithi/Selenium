package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&signInRedirectToFPPThreshold=5&pageId=inflex&useSHuMAWorkflow=false&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=JMV47YHD1E2K5TCGJFN6&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=eyJjaXBoZXIiOiJwcS9ucnUrNmpXNXdaeXdTTlA0a0N6cUdaM2N2UldqV21VZm9RWTBDSW80PSIsIklWIjoiNzgwOFRrZGdWcGlLRGt3eGdBM2NGdz09IiwidmVyc2lvbiI6MX0%3D&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1719997879000");
		
		 WebElement nam=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        nam.sendKeys("Arjun");
        WebElement pho=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
        pho.sendKeys("8977592377");
        WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
        pass.sendKeys("teju@3122");
        WebElement conc=driver.findElement(By.xpath("//input[@id='continue']"));
        conc.click();

	}

}
