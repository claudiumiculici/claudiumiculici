import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddAProductToCartPage {
    protected WebDriver driver;

    public AddAProductToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Awesome Granite Chips")
    private WebElement GraniteChipsProduct;

    public void ClickGraniteChipsProduct() {
        GraniteChipsProduct.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement AddToShoppingCartButton;

    public void ClickAddToShoppingCartButton() {
        AddToShoppingCartButton.click();
    }

    @FindBy (css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement ShoppingCartRedBadge;

    @FindBy (css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement ReturnToBasePageButton;

    public void ClickReturnToBasePageButton() {
        ReturnToBasePageButton.click();
    }

    public WebElement GetShoppingCartRedBadge() {
        return ShoppingCartRedBadge;
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

    @FindBy (linkText = "Gorgeous Soft Pizza")
    private WebElement SoftPizzaProduct;

    public void ClickSoftPizzaProduct() {
        SoftPizzaProduct.click();
    }

    @FindBy (linkText = "Incredible Concrete Hat")
    private WebElement ConcreteHatProduct;

    public void ClickConcreteHatProduct() {
        ConcreteHatProduct.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-shopping-cart.fa-w-18 ")
    private WebElement MinicartButton;

    public void ClickMinicartButton() {
        MinicartButton.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-minus-circle.fa-w-16 ")
    private WebElement MinusSign;

    public void ClickMinusSign() {
        MinusSign.click();
    }

    @FindBy (css = ".text-center.container")
    private WebElement NoProductsCartMessage;

    public WebElement GetNoProductsCartMessage() {
        return NoProductsCartMessage;
    }

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement PageLoginButton;

    public void ClickPageLoginButton() {
        PageLoginButton.click();
    }

    @FindBy (id = "user-name")
    private WebElement UsernameField;

    public void SetUsernameField() {
        UsernameField.sendKeys("dino");
    }

    @FindBy (id = "password")
    private WebElement PasswordField;

    public void SetPasswordField() {
        PasswordField.sendKeys("choochoo");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement LoginButton;

    public void ClickLoginButton() {
        LoginButton.click();
    }

    @FindBy (linkText = "dino")
    private WebElement FirstAccountUsername;

    public WebElement GetFirstAccountUsername() {
        return FirstAccountUsername;
    }

    @FindBy (linkText = "Licensed Steel Gloves")
    private WebElement SteelGlovesProduct;

    public void ClickSteelGlovesProduct() {
        SteelGlovesProduct.click();
    }

    @FindBy (linkText = "Practical Metal Mouse")
    private WebElement MetalMouseProduct;

    public void ClickMetalMouseProduct() {
        MetalMouseProduct.click();
    }

    @FindBy (linkText = "Practical Wooden Bacon")
    private WebElement WoodenBaconProduct;

    public void ClickWoodenBaconProduct() {
        WoodenBaconProduct.click();
    }

    @FindBy (linkText = "Refined Frozen Mouse")
    private WebElement FrozenMouseProduct;

    public void ClickFrozenMouseProduct() {
        FrozenMouseProduct.click();
    }

    public void AddAProductToCartGuestTest() {
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
    }

    public void AddingMultipleProductsToCartGuestTest() {
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickMetalChairProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickSoftShirtProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickSoftPizzaProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickConcreteHatProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
    }

    public void RemovingProductsFromTheCartTest() {
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
        ClickMinicartButton();
        ClickMinusSign();
    }

    public void AddProductToCartUserTest() {
        ClickPageLoginButton();
        SetUsernameField();
        SetPasswordField();
        ClickLoginButton();
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
    }

    public void AddMultipleProductsToTheCartUserTest() {
        ClickPageLoginButton();
        SetUsernameField();
        SetPasswordField();
        ClickLoginButton();
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickMetalChairProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickSoftShirtProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickSoftPizzaProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickConcreteHatProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickSteelGlovesProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickMetalMouseProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickWoodenBaconProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
        ClickFrozenMouseProduct();
        ClickAddToShoppingCartButton();
        ClickReturnToBasePageButton();
    }

    public void RemovingProductsFromTheCartUserTest() {
        ClickPageLoginButton();
        SetUsernameField();
        SetPasswordField();
        ClickLoginButton();
        ClickGraniteChipsProduct();
        ClickAddToShoppingCartButton();
        ClickMinicartButton();
        ClickMinusSign();
    }

}