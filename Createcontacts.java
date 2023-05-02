package seleniumsample;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Createcontacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Amrutha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Kalvakalva");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        String title =driver.getTitle();
		
		System.out.println(title);
		
		String firstName =driver.findElement(By.id("viewContact_firstName_sp")).getText();
		
		System.out.println(firstName);
		
		
		
		
		
		
		
		
	}

}
