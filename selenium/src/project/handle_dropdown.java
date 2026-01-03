package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.network.BytesValue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown {

    public static void main (String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.findElement(By.name("my-select"));

        WebElement datalist = driver.findElement(By.name("my-datalist"));
        datalist.sendKeys("TestData");
        datalist.clear();
        datalist.click();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("generi"));




    }
    }



          /*  Select select = new Select(dropdown);
            WebElement firstselected = select.getFirstSelectedOption();
            //getText method will fetch the text of the element
            System.out.println(firstselected.getText());
// options available in dropdown
            System.out.println("===options available in dropdown===");
            List<WebElement> alloption = select.getOptions();
            // iter shortcut to implement foreach loop
            for (WebElement option : alloption) {
                System.out.println(option.getText());
            }
            select.selectByVisibleText("Two");
            Thread.sleep(2000);
            select.selectByValue("3");
            Thread.sleep(2000);
            select.selectByIndex(0);

        }

*/





