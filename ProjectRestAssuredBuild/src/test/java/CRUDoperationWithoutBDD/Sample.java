package CRUDoperationWithoutBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	@Test
	void sam(){
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.confirmtkt.com/rbooking-d/");
		 driver.findElement(By.xpath("//label[text()='From']")).click();
		WebElement send = driver.findElement(By.xpath("//input[@placeholder='Enter from']"));
	send.sendKeys("kerala");
	}

}
