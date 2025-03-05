package StepDefinition;

import PageObjects.Login;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    public WebDriver driver;
    public Login login;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        login = new Login(driver);
    }

    @When("User open Url {string}")
    public void user_open_url(String url) {
       driver.get(url);
    }

    @Then("Enter username {string} and password {string}")
    public void enter_username_and_password(String mail, String pword) {
      login.enterEmail(mail);
      login.enterpassword(pword);
    }

    @And("click on login")
    public void click_on_login() {
      login.loginbutton();
    }

    @Then("verify the page title {string}")
    public void verify_the_page_title(String expected) {
        String actual= driver.getTitle();
        Assert.assertEquals(expected,actual);
    }

    @And("logout from the page")
        public void logout_from_the_page(){
            login.logoutbutton();
        }

    @Then("verify the homepage title {string}")
    public void verify_the_homepage_title(String hpage) {
        String actual= driver.getTitle();
        Assert.assertEquals(hpage,actual);
    }
    @And("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
