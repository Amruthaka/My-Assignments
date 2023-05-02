package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
			
		driver.close();
		
		
       
         
		
		
		
		
		

	}

}
