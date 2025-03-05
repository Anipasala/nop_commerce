package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebDriver driver;

    public Login(WebDriver driver){
        this.driver=driver;
    }
    private By email= By.id("Email");
    private By password= By.id("Password");
    private By login=By.xpath("//button[contains(text(),\"Log in\")]");
    private By logout=By.xpath("//a[contains(text(),\"Logout\")]");



    public void enterEmail(String uname){
        WebElement textinput= driver.findElement(email);
        textinput.clear();
        textinput.sendKeys(uname);
    }

    public void enterpassword (String pass){
        WebElement inputtext= driver.findElement(password);
        inputtext.clear();
        inputtext.sendKeys(pass);
    }

    public void loginbutton(){
        WebElement log= driver.findElement(login);
        log.click();
    }

    public void logoutbutton(){
        WebElement out= driver.findElement(logout);
        out.click();
    }

}
