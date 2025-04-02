package xpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathForLevis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://levi.in/");
		driver.findElement(By.xpath("//input[@id='st-search']")).sendKeys("jeans");
		driver.findElement(By.xpath("//div[@class='st-image-container'][1]")).click();
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//button[@type='submit' and @name='add']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Choose Your Size')]/parent::*/following-sibling::available-radios-unselected/div/div/p[8]")).click();
		action.sendKeys(Keys.ENTER).build().perform();
	}
}

////p[contains(text(),'Choose Your Size')]/parent::*/following-sibling::button/p[text()='DONE']
