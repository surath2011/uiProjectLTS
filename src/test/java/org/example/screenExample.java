package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class screenExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com/browser-windows");
        String snapName = driver.getTitle();
        File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fl, new File("src/test/screenshots/"+snapName+".jpg"));
        Thread.sleep(2000);
        System.out.println(snapName);
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Sunday");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).submit();
        List<WebElement> btn = driver.findElements(By.xpath("//div[@role='button']"));
        if(btn.size()>0){
            driver.navigate().back();
        }
        driver.quit();
    }
}
