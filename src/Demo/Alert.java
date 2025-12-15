package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("/html[1]/body[1]/input[1]")).click();
		String popup = driver.switchTo().alert().getText();
		System.out.println(popup);
		driver.switchTo().alert().accept();
	}
}