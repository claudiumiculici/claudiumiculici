import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement LoginButton;

    public void ClickLoginButton() {
        LoginButton.click();
    }

    @FindBy (id = "user-name")
    private WebElement UsernameField;

    public void FillUsernameField() {
        UsernameField.sendKeys("dino");
    }

    public void FillSecondAccountUsernameField() {
        UsernameField.sendKeys("beetle");
    }

    public void FillThirdAccountUsernameField() {
        UsernameField.sendKeys("turtle");
    }

    public void FillFourthAccountUsernameField() {
        UsernameField.sendKeys("locked");
    }

    @FindBy (id="password")
    private WebElement PasswordField;

    public void FillPasswordField() {
        PasswordField.sendKeys("choochoo");
    }

    @FindBy (css =".btn.btn-primary")
    private WebElement FinalLoginButton;

    public void ClickFinalLoginButton() {
        FinalLoginButton.click();
    }

    @FindBy (css =".error")
    private WebElement LoginErrorMessage;

    public WebElement GetLoginErrorMessage() {
        return LoginErrorMessage;
    }

    @FindBy (linkText = "dino")
    private WebElement FirstAccountName;

    public WebElement GetFirstAccountName() {
        return FirstAccountName;
    }

    @FindBy (linkText = "beetle")
    private WebElement SecondAccountName;

    public WebElement GetSecondAccountName() {
        return SecondAccountName;
    }

    @FindBy (linkText = "turtle")
    private WebElement ThirdAccountName;

    public WebElement GetThirdAccountName() {
        return ThirdAccountName;
    }

    public void FirstAccountPositiveLogin() {
        ClickLoginButton();
        FillUsernameField();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void FillLoginDetailsExceptUserName () {
        ClickLoginButton();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void FillLoginDetailsExceptPassword() {
        ClickLoginButton();
        FillUsernameField();
        ClickFinalLoginButton();
    }

    public void SecondAccountPositiveLogin() {
        ClickLoginButton();
        FillSecondAccountUsernameField();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void SecondAccountLoginNegativeTest1() {
        ClickLoginButton();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void SecondAccountLoginNegativeTest2() {
        ClickLoginButton();
        FillSecondAccountUsernameField();
        ClickFinalLoginButton();
    }

    public void ThirdAccountPositiveLogin() {
        ClickLoginButton();
        FillThirdAccountUsernameField();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void ThirdAccountNegativeLoginTest1() {
        ClickLoginButton();
        FillPasswordField();
        ClickFinalLoginButton();
    }

    public void ThirdAccountNegativeLoginTest2() {
        ClickLoginButton();
        FillThirdAccountUsernameField();
        ClickFinalLoginButton();
    }

    public void FourthAccountLoginAttempt() {
        ClickLoginButton();
        FillFourthAccountUsernameField();
        FillPasswordField();
        ClickFinalLoginButton();
    }

}














































//    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
//    private WebElement loginIcon;
//
//    public void clickLoginIcon() {
//        loginIcon.click();
//    }
//
//    @FindBy (id = "user-name")
//    private WebElement username;
//
//    public void setUsername() {
//        username.sendKeys("dino");
//    }
//
//    @FindBy (id = "password")
//    private WebElement password;
//
//    public void setPassword(String pass) {
//        password.sendKeys(pass);
//    }
//
//
//    @FindBy (css = ".btn.btn-primary")
//    private WebElement loginButton;
//
//    public void clickLoginButton () {
//        loginButton.click();
//    }
//
//    @FindBy (linkText = "dino")
//    private WebElement correctName;
//
//    public WebElement getCorrectName() {
//        return correctName;
//    }
//
//    @FindBy(css = ".error")
//    private WebElement loginError;
//
//    public WebElement getLoginError() {
//        return loginError;
//    }
//
//    public void anAction () {
//
//    }


//}
