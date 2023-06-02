package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		System.out.println(driver.getTitle());
		
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> Window1 =new ArrayList<String>(windowHandles);
	driver.switchTo().window(Window1.get(1));
	
	System.out.println(driver.getTitle());
	driver.close();
	
	
	driver.switchTo().window(Window1.get(0));
	System.out.println(driver.getTitle());
	
	
	
	
	
	
		
		
		
		
		
		
		

	}

}
