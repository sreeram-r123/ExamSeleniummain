package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//input[@name='username']")WebElement username;
    @FindBy(xpath = "//input[@name='password']")WebElement password;
    @FindBy(xpath = "//button[@type='submit']")WebElement button;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void loginmethod(String un, String pass) {

        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(un);

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
}


