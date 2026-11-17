package Basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pagepkg.LoginPage;


public class BaseClass 
{
	public static WebDriver driver;
    public LoginPage loginobj;

    @BeforeTest
    public void browsersetup() {

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void objectcreation() {

        loginobj =new LoginPage(driver);
    }
}
	
	
	
	

	

