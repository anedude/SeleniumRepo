package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch URL
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		//Click on Bus
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		//Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//select the date picker
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		//select the date as tomorrow
		driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr/td[@class=' ui-datepicker-week-end ']/following-sibling::td)[1]")).click();
		//Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//Print the name of the first resulting bus (use .getText())
		WebElement busName = driver.findElement(By.xpath(("(//h2[contains(text(),'Yolo Bus')])[1]")));
		System.out.println(busName.getText());

		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();

		//Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		WebElement seats = driver.findElement(By.xpath(("(//p[@class='noseats AvailSts ng-binding'])[1]")));
		System.out.println(seats.getText());
		//Click SelectSeat
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		//Choose any one Available seat
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		//Print Seats Selected ,Total Fare
		WebElement totalFare = driver.findElement(By.xpath(("//span[@id='ticketfare']")));
		System.out.println(totalFare.getText());
		//Select Boarding Point  and Dropping Point
		Select board = new Select(driver.findElement(By.id("boardingpoint_id")));
		board.selectByIndex(0);
		Select drop = new Select(driver.findElement(By.id("droppingpoint_id")));
		board.selectByIndex(0);
		//Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser
		driver.close();
	}

}
