package week2.selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("t");
		
		Select drop = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		drop.selectByIndex(3);
		Select drop1 = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		drop1.selectByVisibleText("Automobile");		
		Select drop2 = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		drop2.selectByValue("OWN_SCORP");
		// click on create button
		driver.findElement(By.name("submitButton")).click();
		// click on edit button
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("We are week2 in test leaf - Hurray");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
