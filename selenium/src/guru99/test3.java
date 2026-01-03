package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@class='level0 nav-1 first']")).click();
        driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
        WebElement qtyField = driver.findElement(By.xpath("//input[@title='Qty']"));
        qtyField.clear();
        Thread.sleep(2000);
        qtyField.sendKeys("1000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Update']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("proceed-button")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//p[@class='item-msg error']"));
        String errorText = errorMsg.getText();
        System.out.println("Error Message:" + errorText);

        driver.findElement(By.id("proceed-button")).click();


        //click on empty cart

        driver.findElement(By.xpath("//button[@class='button2 btn-empty']")).click();
        Thread.sleep(2000);
        driver.quit();


    }

}
