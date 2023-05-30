package logics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
//        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//        driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
        driver.findElement(By.name("cusid")).sendKeys("123");
      driver.findElement(By.name("submit")).click();
      driver.switchTo().alert().accept();
      String text = driver.switchTo().alert().getText();
      System.out.println(text);
        ((JavascriptExecutor) driver).executeScript("window.open()");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
    }
}
