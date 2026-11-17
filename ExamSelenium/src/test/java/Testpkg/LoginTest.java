package Testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.BaseClass;

public class LoginTest extends BaseClass {

    @Test(priority = 1)
    public void loginverification() {

        loginobj.loginmethod("Admin", "admin123");
        
        
    }
    
    public void dashboarddisplay()
    {
    	 String actualUrl = driver.getCurrentUrl();

         String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
         Assert.assertEquals(actualUrl, expectedUrl,
                 "Dashboard page is not displayed");
    }
}
