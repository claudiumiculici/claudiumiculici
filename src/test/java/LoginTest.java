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

    @Test(description = "This test attempts to log in the first user.")
    public void PositiveLoginTest() throws InterruptedException {
        loginPage.FirstAccountPositiveLogin();
        assertEquals("dino", loginPage.GetFirstAccountName().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in without the username.")
    public void FirstNegativeLoginTest() throws InterruptedException {
        loginPage.FillLoginDetailsExceptUserName();
        assertEquals("Please fill in the username!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in without the password.")
    public void SecondNegativeLoginTest() throws InterruptedException {
        loginPage.FillLoginDetailsExceptPassword();
        assertEquals("Please fill in the password!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the second user.")
    public void SecondUserPostiveLoginTest() throws InterruptedException {
        loginPage.SecondAccountPositiveLogin();
        assertEquals("beetle", loginPage.GetSecondAccountName().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the second user without the username.")
    public void SecondUserFirstNegativeLoginTest() throws InterruptedException {
        loginPage.SecondAccountLoginNegativeTest1();
        assertEquals("Please fill in the username!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the second user without the password.")
    public void SecondUserSecondNegativeLoginTest() throws InterruptedException {
        loginPage.SecondAccountLoginNegativeTest2();
        assertEquals("Please fill in the password!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the third user.")
    public void ThirdUserPostiveLoginTest() throws InterruptedException {
        loginPage.ThirdAccountPositiveLogin();
        assertEquals("turtle", loginPage.GetThirdAccountName().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the third user without the username.")
    public void ThirdUserFirstNegativeLoginTest() throws InterruptedException {
        loginPage.ThirdAccountNegativeLoginTest1();
        assertEquals("Please fill in the username!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the third user without the password.")
    public void ThirdUserSecondNegativeLoginTest() throws InterruptedException {
        loginPage.ThirdAccountNegativeLoginTest2();
        assertEquals("Please fill in the password!", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test attempts to log in the fourth user.")
    public void FourthAccountLoginAttemptTest() throws InterruptedException {
        loginPage.FourthAccountLoginAttempt();
        assertEquals("The user has been locked out.", loginPage.GetLoginErrorMessage().getText());
        Thread.sleep(3000);
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