import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

@Listeners(ExtentTestNGITestListener.class)

public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void loginTest() throws InterruptedException {

    }

}






































//        loginPage.clickLoginIcon();
//        loginPage.setUsername();
//        loginPage.setPassword("choochoo");
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "informatii");
//        loginPage.clickLoginButton();
//        assertEquals(loginPage.getCorrectName().getText(), "dino");
//        ExtentTestNGITestListener.getTest().pass("The user was able to login succesfully! Test passed successfully");
//    }
//
//    @Test(description = "This test verifies the error message for when the user leaves empty the username field")
//    public void verifyEmptyUsernameMandatoryFieldTest() throws InterruptedException {
//        loginPage.clickLoginIcon();
//        Thread.sleep(3000);
//        loginPage.setPassword("choochoo");
//        loginPage.clickLoginButton();
//        loginPage.anAction();
//        assertEquals(loginPage.getLoginError().getText(), "Please fill in the username!");
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system ");
//    }

//    @Test
//    public void negativeLoginTest() throws InterruptedException {
//        extentTest = extentReports.createTest("Testing the password functionality", "Testing login functionality using test data provided");
//        loginPage.clickLoginIcon();
//        loginPage.setUsername();
//        loginPage.setPassword("ochoo");
//        loginPage.clickLoginButton();
//        assertEquals(loginPage.getCorrectName().getText(), "dino");
//        extentTest.pass("The user was able to login succesfully! Test passed successfully");
//    }


//}