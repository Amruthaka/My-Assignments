package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
			
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amrutha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalvakalva");
		
		WebElement sourcedrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source =new Select(sourcedrop);
		
		source.selectByIndex(4);
		
		WebElement marketcampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select market =new Select(marketcampaign);
		
		market.selectByVisibleText("Automobile");
				
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select owner =new Select(ownership);
		
		owner.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title =driver.getTitle();
		
		System.out.println(title);
		}
		
		
		
		
		
		
		
		

	}
