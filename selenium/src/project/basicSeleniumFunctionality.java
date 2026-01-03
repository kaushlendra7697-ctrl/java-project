package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;


public class basicSeleniumFunctionality {



    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new EdgeDriver();
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String url = driver.getCurrentUrl();
        System.out.println("print current url" + url);
        String title = driver.getTitle();
        System.out.println("title of page :" + title);
        String tabId = driver.getWindowHandle();
        System.out.println("tabId :" + tabId);
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.get("https://www.google.com/?zx=1758627200318&no_sw_cr=1");
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

        WebElement userNameField = driver.findElement(By.id("my-text-id"));
        System.out.println(userNameField.isDisplayed());
        userNameField.sendKeys("Hello Selenium");
        WebElement password = driver.findElement(By.name("my-password"));
        password.sendKeys("Selenium123");
        WebElement textarea = driver.findElement(By.name("my-textarea"));
        textarea.sendKeys("I am learning selenium soon I will get job");


        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
        System.out.println("Current URL: " + driver.getCurrentUrl()); //bonigarcia
        driver.navigate().to("https://www.google.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl()); //google
        driver.navigate().back();
        System.out.println("After back Current URL: " + driver.getCurrentUrl());//bonigarcia
        driver.navigate().forward();
        System.out.println("After forward Current URL: " + driver.getCurrentUrl());//google
        driver.navigate().refresh();
        System.out.println("After refresh Current URL: " + driver.getCurrentUrl());//google

        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement datalist = driver.findElement(By.name("my-datalist"));
        datalist.sendKeys("TestData");
        datalist.clear();
        datalist.click();

    }
        }



