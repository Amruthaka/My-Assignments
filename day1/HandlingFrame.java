package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//button[text() = 'Click Me'])[1]")).click();
        String text = driver.findElement(By.xpath("//button[contains(text(), 'Hurray!')]")).getText();
        System.out.println(text);
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
        String text1 = driver.findElement(By.xpath("//button[contains(text(), 'Hurray!')]")).getText();
        System.out.println(text1);
        
        driver.switchTo().defaultContent();
        List<WebElement> count = driver.findElements(By.tagName("iframe"));
        System.out.println("Iframe count :"+ count.size());
        driver.quit();
        
        
        
        
        
	}

}
