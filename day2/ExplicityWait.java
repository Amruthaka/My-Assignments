package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'I am here']")));
		String text = driver.findElement(By.xpath("//span[text()='Click']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text() ='I am about to hide']")));
		String text1 = driver.findElement(By.xpath("(//span[text()='Click'])[2]")).getText();
		System.out.println(text1);
		
		WebElement eleclickable= driver.findElement(By.xpath("//span[text() ='Click First Button']"));
		wait.until(ExpectedConditions.elementToBeClickable(eleclickable));
		eleclickable.click();
		
		
		WebElement eleclickable1 = driver.findElement(By.xpath("//span[text() ='Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(eleclickable1));

		
		driver.findElement(By.xpath("(//span[text() = 'Click'])[3]")).click();
		String text2 = driver.findElement(By.xpath("//span[text() = 'I am going to change!']")).getText();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text() = 'I am going to change!']"), text2));
		System.out.println(text2);

		
		
		
		

	}

}
