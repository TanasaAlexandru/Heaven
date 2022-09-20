package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;


public class TestHeaven {
    WebDriver driver;
    WebDriverWait wait;


    @Given("I launch chrome browser")
    public void iLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandru.tanasa\\Heaven\\driver\\chromedriver.exe.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @When("I open politrip home page")
    public void iOpenPolitripHomePage() {
        driver.get("https://politrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("cookiescript_accept")).click();
    }


    @And("I press sing up button")
    public void iPressSingUpButton() {
        driver.findElement(By.id("qa_header-signup")).click();
    }


    @And("I click on First Name box and add a name")
    public void iClickOnFirstNameBoxAndAddAName() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name"))).click();
        driver.findElement(By.id("first-name")).sendKeys("Alex");
    }


    @And("I click on Last Name box and add a last name")
    public void iClickOnLastNameBoxAndAddALastName() {
        driver.findElement(By.id("last-name")).sendKeys("Alexandru");
    }


    @And("I click on Email box and add a email")
    public void iClickOnEmailBoxAndAddAEmail() {
        driver.findElement(By.id("email")).sendKeys("alexandru.tanasa@heavensolutions.com");
    }


    @And("I click on Password box and add a password")
    public void iClickOnPasswordBoxAndAddAPassword() {
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Andrei9!");
    }


    @And("I click on Confirm Password box and I confirm password")
    public void iClickOnConfirmPasswordBoxAndAddIConfirmPassword() {
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Andrei9!");
    }


    @And("I click on Sing up box")
    public void iClickOnSingUpBox() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\" qa_loader-button\"]/span")).click();
    }


    @Then("I create a new account successfully")
    public void iCreateANewAccountSuccessfully() {
        System.out.println("I create a new account successfully");
        driver.close();
        driver.quit();

    }

}


