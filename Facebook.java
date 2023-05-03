package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/.");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Amrutha");
		
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("K");
		
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9600156215");
		
		driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("Facebook@93");
		
	    WebElement day1 = driver.findElement(By.id("day"));
	    
        Select day =new Select((WebElement) day1);
        
        day.selectByIndex(6);
        
        WebElement month1 = driver.findElement(By.id("month"));
        
        Select month =new Select((WebElement) month1);
        
        month.selectByVisibleText("Oct");
        
        WebElement years = driver.findElement(By.id("year"));
        
        Select year =new Select((WebElement) years);
        
        year.selectByValue("1990");
        
        driver.findElement(By.xpath("//label[@class = '_58mt']")).click();
        
        
        
        
        
        
		
	     
		
		
		

	}

}
