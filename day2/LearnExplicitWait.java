package week7.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/window.xhtml");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text() = 'Open with delay']")).click();
	
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.numberOfWindowsToBe(3));
    Set<String>twowindow =driver.getWindowHandles();
    List<String>twowindows =new ArrayList<String>(twowindow);
    driver.switchTo().window(twowindows.get(2));
    System.out.println(driver.getTitle());
    driver.close();
    
    
    

	

	}
}
