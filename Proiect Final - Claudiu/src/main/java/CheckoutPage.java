import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy (linkText = "Awesome Granite Chips")
    private WebElement GraniteChipsProduct;

    public void ClickGraniteChipsProduct() {
        GraniteChipsProduct.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement AddToCartButton;

    public void ClickAddToCartButton() {
        AddToCartButton.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement ViewShoppingCartButton;

    public void ClickViewShoppingCartButton() {
        ViewShoppingCartButton.click();
    }

    @FindBy (css = ".btn.btn-success")
    private WebElement CheckoutButton;

    public void ClickCheckoutButton() {
        CheckoutButton.click();
    }

    @FindBy (id = "first-name")
    private WebElement FirstNameField;

    public void FillFirstNameField() {
        FirstNameField.sendKeys("Miculici");
    }

    @FindBy (id = "last-name")
    private WebElement LastNameField;

    public void FillLastNameField() {
        LastNameField.sendKeys("Claudiu");
    }

    @FindBy (id = "address")
    private WebElement AddressField;

    public void FillAddressField() {
        AddressField.sendKeys("Romania, Timis, Giroc, Calea Urseni nr.16B");
    }

    @FindBy (css = ".btn.btn-success")
    private WebElement ContinueCheckoutButton;

    public void ClickContinueCheckoutButton() {
        ContinueCheckoutButton.click();
    }

    @FindBy (css = ".btn.btn-success")
    private WebElement CompleteYourOrderButton;

    public void ClickCompleteYourOrderButton() {
        CompleteYourOrderButton.click();
    }

    @FindBy (css = ".btn.btn-success")
    private WebElement ContinueShoppingButton;

    public WebElement GetContinueShoppingButton() {
        return ContinueShoppingButton;
    }

    @FindBy (css =".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement ReturnToBasePageButton;

    public void ClickReturnToBasePageButton() {
        ReturnToBasePageButton.click();
    }

    @FindBy (linkText = "Awesome Metal Chair")
    private WebElement MetalChairProduct;

    public void ClickMetalChairProduct() {
        MetalChairProduct.click();
    }

    @FindBy (linkText = "Awesome Soft Shirt")
    private WebElement SoftShirtProduct;

    public void ClickSoftShirtProduct() {
        SoftShirtProduct.click();
    }

    @FindBy (css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement Minicart;

    public WebElement GetMinicart() {
        return Minicart;
    }

    public void CheckoutTestAsAUser() {
        ClickGraniteChipsProduct();
        ClickAddToCartButton();
        ClickViewShoppingCartButton();
        ClickCheckoutButton();
        FillFirstNameField();
        FillLastNameField();
        FillAddressField();
        ClickContinueCheckoutButton();
        ClickCompleteYourOrderButton();
    }

    public void MultipleProductsCheckoutGuestTest() {
        ClickGraniteChipsProduct();
        ClickAddToCartButton();
        ClickReturnToBasePageButton();
        ClickMetalChairProduct();
        ClickAddToCartButton();
        ClickReturnToBasePageButton();
        ClickSoftShirtProduct();
        ClickAddToCartButton();
        ClickViewShoppingCartButton();
        ClickCheckoutButton();
        FillFirstNameField();
        FillLastNameField();
        FillAddressField();
        ClickContinueCheckoutButton();
        ClickCompleteYourOrderButton();
    }

}




























































//    @FindBy(id = "input-search")
//    private WebElement searchBar;
//
//    public void setSearchBar() {
//        searchBar.sendKeys("mouse");
//    }
//
//    @FindBy(css = ".btn.btn-light.btn-sm")
//    private WebElement searchButton;
//
//    public void clickSearchButton() {
//        searchButton.click();
//    }
//
//    @FindBy(linkText = "Refined Frozen Mouse")
//    private WebElement frozenMouse;
//
//    public WebElement getFrozenMouse() {
//        return frozenMouse;
//    }
//
//    @FindBy(linkText = "Practical Metal Mouse")
//    private WebElement practicalMouse;
//
//    public WebElement getPracticalMouse() {
//        return practicalMouse;
//    }
//
//    //locator gresit
//    @FindBy(css = "btn btn-liht btn-sm")
//    private WebElement searchButtonFail;
//
//    public void clickSearchButtonFail() {
//        searchButtonFail.click();
//    }
//
//    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
//    private WebElement sortProductsDropDown;
//
//    public WebElement getSortProductsDropDown() {
//        return sortProductsDropDown;
//    }
//
//    public void selectOption(WebElement element, String option) {
//        Select optionSelect = new Select(element);
//        optionSelect.selectByVisibleText(option);
//    }
//
//    // ADD Awesome Granite Chips Product To Cart Test
//    @FindBy(linkText = "Awesome Granite Chips")
//    private WebElement addProductGraniteChipsToCartLink;
//
//    public void clickAddProductGraniteChipsToCartLink() {
//        addProductGraniteChipsToCartLink.click();
//    }
//
//    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
//    private WebElement addProductGraniteChipsToCartButton;
//
//    public void clickAddProductGraniteChipsToCartButton() {
//        addProductGraniteChipsToCartButton.click();
//    }
//
//    @FindBy(xpath = "(//td[@class='amount'])[1]")
//    private WebElement itemsTotal;
//
//    @FindBy(xpath = "(//td[@class='amount'])[3]")
//    private WebElement totalAmount;
//
//    public WebElement getItemsTotal() {
//        return itemsTotal;
//    }
//
//    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
//    private WebElement plusQuantity;
//
//    public void clickQuantity() {
//        plusQuantity.click();
//    }
//
//    public double productPrice(){
//        String amountValue = itemsTotal.getText();
//        String cleanAmountValue = amountValue.replace("$","");
//        return Double.parseDouble(cleanAmountValue);
//    }
//
//    public double taxPrice(){
//        String taxValue = taxAmount.getText();
//        String cleanTaxValue = taxValue.replace("$","");
//        return Double.parseDouble(cleanTaxValue);
//    }
//
//    public double totalPrice(){
//        String totalValue = totalAmount.getText();
//        String cleanTotalValue = totalValue.replace("$","");
//        return Double.parseDouble(cleanTotalValue);
//    }
//    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
//    private WebElement cartButton;
//
//    public void clickCartButton() {
//        cartButton.click();
//    }
//
//    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
//    private WebElement pluseQuantity;
//
//    public void clickPlusQuantity() {
//        pluseQuantity.click();
//    }
//
//    @FindBy(xpath = "(//TD[@class='amount'])[1]")
//    private WebElement amount;
//
//    @FindBy(xpath = "(//TD[@class='amount'])[2]")
//    private WebElement taxAmount;
//
//    @FindBy(id = "item_1_title_link")
//    private WebElement graniteChipsProduct;
//
//    public WebElement getGraniteChipsProduct() {
//        return graniteChipsProduct;
//    }
//
//    @FindBy(css = ".btn.btn-success")
//    private WebElement checkOutButton;
//
//    public WebElement getCheckOutButton() {
//        return checkOutButton;
//    }
//
//    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
//    private WebElement buttonProducts;
//
//    public void clickButtonProducts() {
//        buttonProducts.click();
//    }
//
//    public WebElement getButtonProducts() {
//        return buttonProducts;
//    }
//
//    //@FindBy(xpath = "//div[text()='Sort by name (Z to A)']")
//    // private WebElement divElement;
//    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
//    // @FindBy(css = ".col-md-auto")
//    private WebElement buttonSortProducts;
//
//    public void clickButtonSortProducts() {
//        buttonSortProducts.click();
//    }
//
//    // @FindBy()
//
//    public WebElement getButtonSortProducts() {
//        return buttonSortProducts;
//    }
//
//}
