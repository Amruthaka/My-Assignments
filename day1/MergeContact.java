package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text() ='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> Window1 =new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(Window1.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[contains(@class,'inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
		
        Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> Window2 =new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(Window2.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//img[@alt = 'Lookup'])[2]")).click();
			
		Set<String> windowHandles3 = driver.getWindowHandles();
		
        List<String> Window3 =new ArrayList<String>(windowHandles3);
        	
		driver.switchTo().window(Window3.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[contains (@class,'inner x-grid3-col-partyId')]/a[@class = 'linktext'])[2]")).click();
		
        Set<String> windowHandles4 = driver.getWindowHandles();
		
		List<String> Window4 =new ArrayList<String>(windowHandles4);
		
		driver.switchTo().window(Window4.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	
		System.out.println(driver.getTitle());
		
	
		
		
		
		
	
		
		
	}
}