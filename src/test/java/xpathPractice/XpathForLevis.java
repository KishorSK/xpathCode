package xpathPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathForLevis {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://levi.in/");
		driver.findElement(By.xpath("//input[@id='st-search']")).sendKeys("jeans");
		driver.findElement(By.xpath("//div[@class='st-image-container'][1]")).click();
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//button[@type='submit' and @name='add']")).click();
		//driver.findElement(By.xpath("//p[contains(text(),'Choose Your Size')]/parent::*/following-sibling::available-radios-unselected/div/div/p[8]")).click();
		WebElement availableSize =driver.findElement(By.xpath("//p[contains(@class, 'size-pop-variant') and not(contains(@class, 'tw-line-through'))][2]"));
		availableSize.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add_button_size_popup']/p[contains(text(),'DONE')]")).click();
		
		driver.findElement(By.xpath("//div[@class='gokwik-checkout']")).click();
		WebElement GokwikPopup=driver.findElement(By.xpath("//iframe[@id='gokwik-iframe']"));
		driver.switchTo().frame(GokwikPopup);
		driver.findElement(By.xpath("//input[@id='phone-input']")).sendKeys("6379209969");
		System.out.println("Please enter the OTP");
		Thread.sleep(15000);
		//need to write code to neglate the time after entering otp
		driver.findElement(By.xpath("//button[@id='continue-button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cash on Delivery')]/following-sibling::span[contains(text(),'Amount Non-Refundable')]")).click();
		driver.findElement(By.xpath("//input[@id='vpaId']")).sendKeys("kishorssk2001-1@okicici");
		driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
	}
}

////p[contains(text(),'Choose Your Size')]/parent::*/following-sibling::button/p[text()='DONE']
