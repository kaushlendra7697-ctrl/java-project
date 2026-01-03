package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class expand_range {

    public static void main (String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.manage().window().maximize();

        WebElement slider =
                driver.findElement(By.xpath("//input[@name='my-range']"));

        Actions action = new Actions(driver);

        Thread.sleep(5000);
        driver.quit();


    }

}
