import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class AddProductToCartTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

//    @Test
//    public void checkoutAsAGuestTest() throws InterruptedException { // InterruptedException e pentru threadsleep, se poate sterge daca nu il folosesti.
//        //TEST 1
//        extentTest = extentReports.createTest("Add Product To Cart Test", "Simple adding a product to cart using 'Granite Chips' product");
//        checkoutPage.clickAddProductGraniteChipsToCartLink();
//        checkoutPage.clickAddProductGraniteChipsToCartButton();
////        checkoutPage.clickCartButton();
//        extentTest.log(Status.INFO, "Verify in cart page if the product was successfully added");
//        Thread.sleep(9000);
//        assertEquals("Awesome Granit Chips", checkoutPage.getGraniteChipsProduct().getText());
//        assertEquals("Checkout button", checkoutPage.getCheckOutButton().getText());
//        extentTest.log(Status.INFO, "Awesome Granite Chips products was successfully added to cart");
//        extentTest.log(Status.INFO, "The test passed successfully and the user is able to checkout");
//        Thread.sleep(3000);
//    }

//    @Test
//    public void checkoutSort() throws InterruptedException {
//        extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
//        extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
//        checkoutPage.clickButtonProducts();
//        Thread.sleep(3000);
//        checkoutPage.clickButtonSortProducts();
//        Thread.sleep(3000);
//        checkoutPage.selectOption(checkoutPage.getButtonSortProducts(), "Sort by name (Z to A)");
//        Thread.sleep(3000);
//        extentTest.pass("The search returned two products! Test passed successfully");
//    }


    @Test
    public void testFindByStatus() {
        // Set the base URI for Rest-Assured
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Make a GET request to /pet/findByStatus?status=available
        Response response = given()
                .queryParam("status", "avaiable")
                .header("accept", "application/json")
                .when()
                .get("/pet/findByStatus")
                .then()
                .extract()
                .response();

        // Assert the HTTP response status code is 200 OK
        Assert.assertEquals(response.getStatusCode(), 200);

        // Assert the response contains the expected "name" value
        String responseBody = response.asString();
        Assert.assertTrue(responseBody.contains("\"name\":\"doggie\""));

        // You can add more assertions here to validate the response further, e.g., check the content type
        Assert.assertEquals(response.getHeader("Content-Type"), "application/json");
    }
}

