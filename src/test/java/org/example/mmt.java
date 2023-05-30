package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class mmt {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
        driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
        driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10' ])[1]")).click();
        WebElement element1 = driver.findElement(By.xpath("(//p[text()='17'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
        WebElement element2 = driver.findElement(By.xpath("(//p[text()='26'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
        WebElement element3 = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);
        Actions act = new Actions(driver);
        act.click(element3).build().perform();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='whiteText blackFont fontSize16'])[1]")));
        System.out.println(driver.findElement(By.xpath("(//span[@class='whiteText blackFont fontSize16'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//span[@class='whiteText blackFont fontSize16'])[2]")).getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
