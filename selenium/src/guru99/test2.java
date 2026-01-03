package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
        WebElement listPriceElement = driver.findElement(By.xpath("//div[@class='price-box']"));
        String listPrice = listPriceElement.getText();

        System.out.println("price on list page : " + listPrice);

        driver.findElement(By.xpath("//a[text()='Sony Xperia']")).click();
        WebElement detailPriceElement = driver.findElement(By.xpath("//span[@class='price']"));
        String detailPrice = detailPriceElement.getText();
        System.out.println("price on detail page:" + detailPrice);


        // compare both price
        if (listPrice.equals(detailPrice)) {
            System.out.println("price match Test passed.");
        } else {
            System.out.println("Price do not match Test Failed.");

        }
        Thread.sleep(4000);
        driver.quit();
    }

}
