package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		//System.out.println("HELLO WORLD");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.figma.com/files/team/1454549014324875615/recents-and-sharing?fuid=1454549012715402831");
		System.out.println("test case pass");
		String url = driver.getTitle();
		System.out.println(url);
		String surl = driver.getCurrentUrl();
		System.out.println("the url of page is : " + surl);
		driver.navigate().refresh();
		driver.close();
	}
}
 