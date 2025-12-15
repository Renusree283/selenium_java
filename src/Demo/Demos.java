package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demos {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select dropCountry = new Select(driver.findElement(By.id("country")));
		dropCountry.selectByVisibleText("India");
		Select dropCity = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[11]/div[1]/select[1]"+" ")));
		dropCity.selectByIndex(1);
	}
}
