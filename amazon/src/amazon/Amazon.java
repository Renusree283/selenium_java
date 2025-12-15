package amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurthis");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");

        driver.findElement(By.className("s-image")).click();
        
        Set<String> windows = driver.getWindowHandles();
        for(String win : windows) {
        	driver.switchTo().window(win);
        }

        driver.findElement(By.name("2")).click();
        js.executeScript("window.scrollTo(0,500)");

        Thread.sleep(2000);
        
        driver.findElement(By.id("add-to-cart-button")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        
        driver.navigate().back();
        
    }
}