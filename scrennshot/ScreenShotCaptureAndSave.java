package guru99;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class ScreenShotCaptureAndSave {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/?zx=1767178540484&no_sw_cr=1");
        //source  file
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       //define destination file
        File DestFile = new File("F:/Screenshot using selenium java/BB.png");
        // copy  file from source to destination
        FileHandler.copy(srcFile, DestFile);

        driver.quit();
    }
}

