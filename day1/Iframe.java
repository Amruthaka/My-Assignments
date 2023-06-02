package week4.day1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text() ='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File desc =new File("./snap/img1.png");
		FileUtils.copyFile(screenshot, desc);
		
		
		
		
		

	}

}
