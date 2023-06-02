package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String msg = driver.findElement(By.xpath("//span[@id= 'simple_result']")).getText();
		System.out.println(msg);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text() ='Show'])[2]")).click();
		
		Alert alert1= driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@id ='result']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text() ='Dismiss']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String text2 = driver.findElement(By.xpath(" //p[@class = 'm-0']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//span[@class ='ui-icon ui-icon-closethick'])[2]")).click();
		WebElement close = driver.findElement(By.xpath("(//span[@class ='ui-icon ui-icon-closethick'])[2]"));
	    close.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text() ='Show'])[5]")).click();
		Alert alert2= driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert.sendKeys("Amrutha");
		alert.accept();
		String text3 = driver.findElement(By.xpath("//span[@id ='confirm_result']")).getText();
		System.out.println(text3);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text() = 'Yes']")).click();
		String text4 = driver.findElement(By.xpath("//span[text() = 'Are you sure you want to proceed?']")).getText();
		System.out.println(text4);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		String text5 = driver.findElement(By.xpath("(//p[@class = 'm-0'])[2]")).getText();
		System.out.println(text5);
		driver.findElement(By.xpath("(//span[@class ='ui-icon ui-icon-closethick'])[3]")).click();
		WebElement close1 = driver.findElement(By.xpath("(//span[@class ='ui-icon ui-icon-closethick'])[3]"));
	    close1.click();
		
		
		
		
		
		
		

	}

}
