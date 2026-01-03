package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

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
            Thread.sleep(2000);

            driver.quit();

        }
    }



