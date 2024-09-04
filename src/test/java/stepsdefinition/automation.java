package stepsdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class automation {

    public static WebDriver driver;


    @Given("User navigates to the login page")
    public void theUserIsOnTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://marmelab.com/react-admin-demo/#/login");
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        // Enter valid credentials
        driver.findElement(By.xpath("//input[@id=':rk:']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("password");
    }

    @When("the user clicks the sign in button")
    public void the_user_clicks_the_login_button() {
        // Click the sign in button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]")).click();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Verify redirection to the dashboard
        String expectedUrl = "https://marmelab.com/react-admin-demo/#/";
        String actualUrl = driver.getCurrentUrl();
        assert(expectedUrl.equals(actualUrl));
    }
    @When("the user logs out")
    public void the_user_logs_out() {
        // Log out the user
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[1]/div[2]/span[1]")).click();
    }


    @Then("he user should be redirected to the login page")
    public void heUserShouldBeRedirectedToTheLoginPage() {
        // Verify redirection to login page
        String expectedUrl = "https://marmelab.com/react-admin-demo/#/login";
        String actualUrl = driver.getCurrentUrl();
        assert(expectedUrl.equals(actualUrl));
    }


}



