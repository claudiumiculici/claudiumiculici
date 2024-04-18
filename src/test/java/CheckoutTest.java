import com.aventstack.extentreports.Status;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.zip.Deflater;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

@Listeners(ExtentTestNGITestListener.class)

public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;


    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 30);
    }


}

































//    (description = "Tests the search functionality by searching for the keyword 'mouse'")
//    public void searchTest() {
//        checkoutPage.setSearchBar();
//        checkoutPage.clickSearchButton();
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The search engine is looking up for the keyword 'mouse'");
//    }

//    @Test(description = "Calculating the price when changing quantity of a product")
//    public void quantityOfAProductTest() {
//        checkoutPage.clickAddProductGraniteChipsToCartLink();
//        checkoutPage.clickAddProductGraniteChipsToCartButton();
//        checkoutPage.clickCartButton();
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
//        double expectedTotal = checkoutPage.productPrice() * 2;
//        checkoutPage.clickQuantity();
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after updating quantity to 2 is: " + checkoutPage.productPrice());
//        assertEquals(checkoutPage.productPrice(), expectedTotal);
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The prices match");
//
//    }
//
//    @Test(description = "Calculating the total price with taxes")
//    public void totalPriceWithTaxesTest() {
//        checkoutPage.clickAddProductGraniteChipsToCartLink();
//        checkoutPage.clickAddProductGraniteChipsToCartButton();
//        checkoutPage.clickCartButton();
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The tax price is: " + checkoutPage.taxPrice());
//        double expectedTotal = checkoutPage.productPrice() + checkoutPage.taxPrice();
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The total price should be " + expectedTotal);
//        ExtentTestNGITestListener.getTest().log(Status.INFO, "The total price is " + checkoutPage.totalPrice());
//        assertEquals(checkoutPage.totalPrice(), expectedTotal);
//    }

//    @Test(description = "Checking the username field is mandatory")
//    public void usernameNegativeTestOnCheckoutPage() {
//        // clickpeprodus
//        // alte actiuni
//        // assert
//        // log: "the user received an error message stating: "
//    }

//    @Test
//    public void testFindByStatus() {
//        RestAssured.baseURI = "https://petstore.swagger.io/v2";
//
//        // Prepare the request details for logging
//        String requestDetails = "GET /pet/findByStatus?status=available" +
//                "Accept: application/json" +
//                "Base URI: " + RestAssured.baseURI;
//
//        // Execute the request
//        Response response = given()
//                .queryParam("status", "available")
//                .header("accept", "application/json")
//                .when()
//                .get("/pet/findByStatus");
//
//        // Prepare the response details for logging
//        String responseDetails = "Status Code: " + response.getStatusCode() + "\n" +
//                "Content-Type: " + response.getHeader("Content-Type") + "\n" +
//                "Body:\n" + response.asString();
//
//        // Perform assertions and log results
//        try {
//            Assert.assertEquals(response.getStatusCode(), 200, "Unexpected status code.");
//            Assert.assertEquals(response.getHeader("Content-Type"), "application/json", "Unexpected Content-Type.");
//            Assert.assertTrue(response.asString().contains("\"name\":\"doggie\""), "Response body does not contain the expected name value");
//
//            // Log request and response details to ExtentReports on success
//            ExtentTestNGITestListener.getTest().log(Status.PASS, "Request Details:\n" + requestDetails);
//            ExtentTestNGITestListener.getTest().log(Status.PASS, "Response Details:\n" + responseDetails);
//            ExtentTestNGITestListener.getTest().pass("Test passed successfully");
//        } catch (AssertionError e) {
//            // Log request and response details to ExtentReports on failure
//            ExtentTestNGITestListener.getTest().log(Status.FAIL, "Request Details:\n" + requestDetails);
//            ExtentTestNGITestListener.getTest().log(Status.FAIL, "Response Details:\n" + responseDetails);
//            ExtentTestNGITestListener.getTest().fail(e.getMessage());
//            throw e; // Rethrow the exception to ensure the test is marked as failed
//        }
//    }
//
//    @Test
//    public void testFindById() {
//        RestAssured.baseURI = "https://petstore.swagger.io/v2";
//
//        // Prepare the request details for logging
//        String requestDetails = "GET /pet/9223372036854596503\n" +
//                "Accept: application/json\n" +
//                "Base URI: " + RestAssured.baseURI;
//
//        // Execute the request
//        Response response = given()
//                .queryParam("status", "avalable")
//                .header("accept", "application/json")
//                .when()
//                .get("/pet/findByStatus");
//
//        // Prepare the response details for logging
//        String responseDetails = "Status Code: " + response.getStatusCode() + "\n" +
//                "Content-Type: " + response.getHeader("Content-Type") + "\n" +
//                "Body:\n" + response.asString();
//
//        // Perform assertions and log results
//        try {
//            Assert.assertEquals(response.getStatusCode(), 200, "Unexpected status code.");
//            Assert.assertEquals(response.getHeader("Content-Type"), "application/json", "Unexpected Content-Type.");
//            Assert.assertTrue(response.asString().contains("\"name\":\"doggie\""), "Response body does not contain the expected name value");
//
//            // Log request and response details to ExtentReports on success
//            ExtentTestNGITestListener.getTest().log(Status.PASS, "Request Details:\n" + requestDetails);
//            ExtentTestNGITestListener.getTest().log(Status.PASS, "Response Details:\n" + responseDetails);
//            ExtentTestNGITestListener.getTest().pass("Test passed successfully");
//        } catch (AssertionError e) {
//            // Log request and response details to ExtentReports on failure
//            ExtentTestNGITestListener.getTest().log(Status.FAIL, "Request Details:\n" + requestDetails);
//            ExtentTestNGITestListener.getTest().log(Status.FAIL, "Response Details:\n" + responseDetails);
//            ExtentTestNGITestListener.getTest().fail(e.getMessage());
//            throw e; // Rethrow the exception to ensure the test is marked as failed
//        }



//}
