import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Listeners;

@Listeners(ExtentTestNGITestListener.class)


public class AddProductToCartTest extends Hooks {


    public AddAProductToCartPage addAProductToCartPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        addAProductToCartPage = new AddAProductToCartPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = "This test will add a product to the cart as a guest.")
    public void AddProductToCartGuestTest() throws InterruptedException {
        addAProductToCartPage.AddAProductToCartGuestTest();
        assertEquals("1", addAProductToCartPage.GetShoppingCartRedBadge().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test will add multiple items to the cart as a guest.")
    public void AddMultipleProductsToCartGuestTest() throws InterruptedException {
        addAProductToCartPage.AddingMultipleProductsToCartGuestTest();
        assertEquals("5", addAProductToCartPage.GetShoppingCartRedBadge().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test will try to remove a product from the cart.")
    public void RemovingProductsFromTheCartGuestTest() throws InterruptedException {
        addAProductToCartPage.RemovingProductsFromTheCartTest();
        assertEquals("How about adding some products in your cart?", addAProductToCartPage.GetNoProductsCartMessage().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test will add a product to the cart as a logged in user.")
    public void AddProductToCartUserTest() throws InterruptedException {
        addAProductToCartPage.AddProductToCartUserTest();
        assertEquals("dino", addAProductToCartPage.GetFirstAccountUsername().getText());
        assertEquals("1", addAProductToCartPage.GetShoppingCartRedBadge().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test will add all the products from the page into the cart as a logged in user.")
    public void AddMultipleProductsToTheCartUserTest() throws InterruptedException {
        addAProductToCartPage.AddMultipleProductsToTheCartUserTest();
        assertEquals("dino", addAProductToCartPage.GetFirstAccountUsername().getText());
        assertEquals("9", addAProductToCartPage.GetShoppingCartRedBadge().getText());
        Thread.sleep(3000);
    }

    @Test(description = "This test will remove products from the cart as a logged in user.")
    public void RemovingProductsFromTheCartUserTest() throws InterruptedException {
        addAProductToCartPage.RemovingProductsFromTheCartUserTest();
        assertEquals("How about adding some products in your cart?", addAProductToCartPage.GetNoProductsCartMessage().getText());
        Thread.sleep(3000);
    }

}

