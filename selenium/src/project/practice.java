package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class practice {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/drag-and-drop.html");
        driver.manage().window().maximize();

      //  Identify source and target element
        WebElement source =
                driver.findElement(By.id("draggable"));
        WebElement target =
                driver.findElement(By.id("target"));

        //perform drag and drop using action class
            Actions actions= new Actions(driver);

            actions.dragAndDrop(source,target).perform();
            Thread.sleep(6000);
            driver.quit();
        

    }
}
