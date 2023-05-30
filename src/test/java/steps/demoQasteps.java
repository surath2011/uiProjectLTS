package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class demoQasteps {
    launcher l = new launcher();
    private WebDriver driver = l.launcher();
    @Given("open demo qa")
    public void open_demo_qa() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        try {
            boolean btn = driver.findElement(By.id("windowButtons")).isDisplayed();
        } catch (Exception e) {
            System.out.println("wrong button not available in the page");
        }
    }
    @When("click window button")
    public void click_window_button() throws InterruptedException {
        driver.findElement(By.id("windowButton")).click();
        System.out.println("clicked window button");
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }
    @Then("child window opens")
    public void child_window_opens() {
        System.out.println("closing the browser");
        driver.quit();
    }
}
