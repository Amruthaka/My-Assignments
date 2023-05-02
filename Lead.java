package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ChromeDriver driver =new ChromeDriver();
	 
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amrutha");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalvakalva");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amrutha");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium basics");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kamrutha1990@gmail.com");
	
	driver.findElement(By.name("submitButton")).click();
	
	String title =driver.getTitle();
	
	System.out.println(title);
	
	
	
	 
		

	}

}
