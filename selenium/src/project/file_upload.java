package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

    public static void main (String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.manage().window().maximize();

        WebElement uploadElement =
        driver.findElement(By.name("my-file"));


        uploadElement.sendKeys("F:\\demo file\\New Microsoft Word Document.docx");

        Thread.sleep(6000);
        driver.quit();

    }

}
