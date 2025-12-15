package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("kiran sahu");
		driver.findElement(By.className("signin-btn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.linkText("Get a new Rediffmail ID")).click();
		System.out.println("test case passed");
		driver.close();
	}
}
