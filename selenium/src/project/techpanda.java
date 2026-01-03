package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.title;

public class techpanda{
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://live.techpanda.org/index.php/");
        String homeTitle = driver.getTitle();
        if (homeTitle.equals("Home page"))
        {
            System.out.println("Home page title verified:" + homeTitle);

        }
        else {
            System.out.println("home page title mismatch found :" +homeTitle );
        }

        driver.findElement(By.xpath("//a[@class ='level0 ']")).click();
        // select
        Select sortBy = new Select(driver.findElement(By.xpath("//select[@title='Sort By']")));
        sortBy.selectByVisibleText("Name");
        System.out.println("Selected 'short by: name' successfully");

        driver.quit();

    }
}
