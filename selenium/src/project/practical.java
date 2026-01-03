package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practical {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
        driver.findElement(By.xpath("//a[@title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("kaushlendra");
        driver.findElement(By.id("lastname")).sendKeys("soni");
        driver.findElement(By.id("email_address")).sendKeys("abcdefgh@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234567890");
        driver.findElement(By.id("confirmation")).sendKeys("1234567890");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();


        Thread.sleep(6000);
        driver.quit();


    }
}