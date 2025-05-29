package xpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practiceLevis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://levi.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement men = driver.findElement(By.id("Details-HeaderMenu-2"));
		Actions action = new Actions(driver);
		action.moveToElement(men).build().perform();
		driver.findElement(By.xpath("(//ul[@id='HeaderMenu-SubMenuList-1']//a[contains(text(),'Jeans')])[1]")).click();
	}
}
