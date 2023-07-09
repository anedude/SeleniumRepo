package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Type "Bags" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		//Print the total number of results (like 50000) 1-48 of over 50,000 results for "bags for boys"
		WebElement results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"));
		System.out.println(results.getText());
		//Select the first 2 brands in the left menu (like American Tourister, Generic)
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[4]")).click();

		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[5]")).click();

		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();

		//Print the first resulting bag info (name, discounted price)
		WebElement bagInfo = driver.findElement(By.xpath("//span[contains(text(),'Disney Mickey')]"));
		WebElement discountedPrice = driver.findElement(By.xpath("//span[text()='996']"));
		System.out.println(bagInfo.getText());
		System.out.println(discountedPrice.getText());
		// Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser
		driver.close();
	}

}
