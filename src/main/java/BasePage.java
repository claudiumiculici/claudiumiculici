import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".sort-products-select.form-control.form-control-sm")
    private WebElement SortProductsDropDown;

    public WebElement GetSortProductsDropDown() {
        return SortProductsDropDown;
    }

    public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

    @FindBy (id = "input-search")
    private WebElement BasePageSearchBar;

    public void FillInBasePageSearchBar() {
        BasePageSearchBar.sendKeys("Mouse");
    }

    public void SecondSearch() {
        BasePageSearchBar.sendKeys("Pizza");
    }

    public void ThirdSearch() {
        BasePageSearchBar.sendKeys("Chair");
    }

    public void FourthSearch() {
        BasePageSearchBar.sendKeys("Chips");
    }

    public void FifthSearch() {
        BasePageSearchBar.sendKeys("Hat");
    }

    public void FillInSecondSearch() {
        BasePageSearchBar.sendKeys("Practical Metal Mouse");
    }

    @FindBy (css = ".btn.btn-light.btn-sm")
    private WebElement BasePageSearchButton;

    public void ClickBasePageSearchButton() {
        BasePageSearchButton.click();
    }

    @FindBy (css =".svg-inline--fa.fa-heart.fa-w-16.fa-2x")
    private WebElement WhishlistButton;

    public void ClickWishlistButton() {
        WhishlistButton.click();
    }

    @FindBy (css =".svg-inline--fa.fa-heart.fa-w-16")
    private WebElement WishlistPageButton;

    public void ClickWishlistPageButton() {
        WishlistPageButton.click();
    }

    @FindBy (css =".subheader-container")
    private WebElement WishlistHeader;

    public WebElement GetWishlistHeader() {
        return WishlistHeader;
    }

    @FindBy (css =".svg-inline--fa.fa-heart-broken.fa-w-16.fa-2x")
    private WebElement WishlistBrokenHeart;

    public void ClickWishlistBrokenHeart() {
        WishlistBrokenHeart.click();
    }

    @FindBy (css =".justify-content-end.row")
    private WebElement WishlistProduct;

    public WebElement GetWishlistProduct() {
        return WishlistProduct;
    }

    @FindBy (css =".svg-inline--fa.fa-question.fa-w-12")
    private WebElement HelpButton;

    public void ClickHelpButton() {
        HelpButton.click();
    }

    @FindBy (css =".modal-header")
    private WebElement LoginTablePopup;

    public WebElement GetLoginTablePopup() {
        return LoginTablePopup;
    }

    @FindBy (css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement ReturnToBasePageButton;

    public void ClickReturnToBasePageButton() {
        ReturnToBasePageButton.click();
    }

    @FindBy (css = ".card-link")
    private WebElement HatProduct;

    public WebElement GetHatProduct() {
        return HatProduct;
    }

    public void FirstSearch() {
        FillInBasePageSearchBar();
        ClickBasePageSearchButton();
    }

    public void AddingToWishlist() {
        FillInSecondSearch();
        ClickBasePageSearchButton();
        ClickWishlistButton();
    }

    public void WishlistPage() {
        FillInSecondSearch();
        ClickBasePageSearchButton();
        ClickWishlistButton();
        ClickWishlistPageButton();
    }

    public void RemovingItemFromWishlistPage() {
        FillInSecondSearch();
        ClickBasePageSearchButton();
        ClickWishlistButton();
        ClickWishlistPageButton();
        ClickWishlistBrokenHeart();
    }

    public void HelpButtonTest() {
        ClickHelpButton();
    }

    public void MultipleSearchTest() {
        FillInBasePageSearchBar();
        ClickBasePageSearchButton();
        ClickReturnToBasePageButton();
        SecondSearch();
        ClickBasePageSearchButton();
        ClickReturnToBasePageButton();
        ThirdSearch();
        ClickBasePageSearchButton();
        ClickReturnToBasePageButton();
        FourthSearch();
        ClickBasePageSearchButton();
        ClickReturnToBasePageButton();
        FifthSearch();
        ClickBasePageSearchButton();
    }


}