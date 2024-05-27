import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//@Listeners(ExtentTestNGITestListener.class)

public class BasePageTest extends Hooks {

    public BasePage basePage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        basePage = new BasePage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = "This test is clicking on the drop bar from the base page.")
    public void SortProductsTest() throws InterruptedException {
        basePage.selectOption(basePage.GetSortProductsDropDown(), "Sort by name (A to Z)");
        basePage.selectOption(basePage.GetSortProductsDropDown(), "Sort by name (Z to A)");
        basePage.selectOption(basePage.GetSortProductsDropDown(), "Sort by price (low to high)");
        basePage.selectOption(basePage.GetSortProductsDropDown(), "Sort by price (high to low)");
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "Clicking on the drop bar from the base page to check for functionality issues");
    }

    @Test(description = "This test is searching for a product using the search bar from the base page.")
    public void BasePageSearchEngineTest() throws InterruptedException {
        basePage.FirstSearch();
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "This test is searching for the keyword 'Mouse'");
    }

    @Test(description = "This test is searching for a product and adding it to the wishlist page.")
    public void AddingProductsToWishlistTest() throws InterruptedException {
        basePage.AddingToWishlist();
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "This test is searching for the keyword 'Practical Metal Mouse' and adding it to the wishlist page");
    }

    @Test(description = "This test is searching and adding a product to the wishlist and afterwards testing the wishlist page.")
    public void WishlistPageTest() throws InterruptedException {
        basePage.WishlistPage();
        assertEquals("Wishlist", basePage.GetWishlistHeader().getText());
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "A product has been added to the wishlist page and the page has been opened to see if the correct product and specifications are saved for the user.");
    }

    @Test(description = "This test is searching and adding a product to the wishlist and afterwards removing it.")
    public void RemovingItemFromWishlistTest() throws InterruptedException {
        basePage.RemovingItemFromWishlistPage();
        wait.until(ExpectedConditions.invisibilityOf(basePage.GetWishlistProduct()));
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "A product has been added to the wishlist page and now the test will remove the product");
    }

    @Test(description = "This test will click on the '?' button on the bottom of the page and wait for a response.")
    public void HelpButtonTest() throws InterruptedException {
        basePage.HelpButtonTest();
        wait.until(ExpectedConditions.visibilityOf(basePage.GetLoginTablePopup()));
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The button marked with a '?' from the bottom right side of the base page has been clicked and waited for a response");
    }

    @Test(description = "This test will have multiple searches on the site.")
    public void MultipleSearchTest() throws InterruptedException {
        basePage.MultipleSearchTest();
        assertEquals("Incredible Concrete Hat", basePage.GetHatProduct().getText());
        Thread.sleep(5000);
    }

}