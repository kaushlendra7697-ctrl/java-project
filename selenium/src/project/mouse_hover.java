package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/mouse-over.html");
        driver.manage().window().maximize();

        WebElement compass =

                driver.findElement(By.xpath("//img[@src='img/compass.png']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(compass).perform();

        Thread.sleep(3000);

        WebElement calender =

                driver.findElement(By.xpath("//img[@src='img/calendar.png']"));
         Actions actions2 = new Actions(driver);
         actions.moveToElement(calender).perform();

         Thread.sleep(3000);

         WebElement  award =

                 driver.findElement(By.xpath("//img[@src='img/award.png']"));
         Actions actions3 = new Actions(driver);
         actions.moveToElement(award).perform();
         Thread.sleep(5000);



         driver.quit();




    }
}
