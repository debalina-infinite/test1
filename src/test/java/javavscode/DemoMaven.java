package javavscode;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testing.annotations.Test;

public class DemoMaven {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.findElement(By.className("inputarea")).sendKeys("bob");
        driver.findElement(By.cssSelector("input[type='password'")).sendKeys("bob123");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
    public void sampleMethod()
    {
        System.out.println("This is a sample method.");
    }
}