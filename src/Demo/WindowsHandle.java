package Demo;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parent = driver.getWindowHandle();
		System.out.println("parent window is :" + parent);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);
		for(String child : allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				System.out.println("text inside the child window is : " +text);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("title of parent window is : "+driver.getTitle());
	}
}


