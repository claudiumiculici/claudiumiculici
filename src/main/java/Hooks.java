import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {


    public WebDriver driver;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "//Users/claudiu/Desktop/Empty Automation Solution/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://fasttrackit-test.netlify.app/#/");
    }

    @AfterMethod
    public void tearDown() {
            driver.quit();
        }
}
