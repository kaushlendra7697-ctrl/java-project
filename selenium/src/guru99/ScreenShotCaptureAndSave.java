package guru99;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;


public class ScreenShotCaptureAndSave {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/?zx=1767178540484&no_sw_cr=1");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       // File des = new File("C:\\Users\\WELCOME\\Pictures\\scr");

        driver.quit();
    }
}
