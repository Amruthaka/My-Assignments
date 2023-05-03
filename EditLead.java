package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name = 'USERNAME']")).sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'ext-gen248']")).sendKeys("Amrutha");
		
		driver.findElement(By.xpath("//button[@id = 'ext-gen334']")).click();
		
		driver.findElement(By.xpath("//a[text() = '10993']")).click();
		
        String title =driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).sendKeys("TF");
		
		driver.findElement(By.xpath("//input[@value= 'Update']")).click();
		
		String companyName =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(companyName);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
