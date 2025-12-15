package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame2");
		String frametext = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(frametext);
	}
}
