package Pages;

import Utilities.BasicDriver;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_POM extends Methods {
    public Amazon_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(id = "nav-logo-sprites")
    private WebElement amazonLoGo;
    @FindBy(xpath = "//span[text()='Hello, sign in']")
    private WebElement helloSignIn;
    @FindBy(xpath = "(//span[text()='Sign in'])[1]")
    private WebElement SignIn;
    @FindBy(xpath = "(//input[@type='submit'])[1]")
    private WebElement SearchIcon;
    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmail;
    @FindBy(id = "continue")
    private WebElement continueBtn;
    @FindBy(css = "input[type='password']")
    private WebElement passwordBtn;
    @FindBy(id = "signInSubmit")
    private WebElement signInSubmitBtn;
    @FindBy(css = "input[type='text']")
    private WebElement searchBar;
    @FindBy(css = "img[alt='100+ Solutions in Java: A Hands-On Introduction to Programming in Java (English Edition)']")
    private WebElement JavaBook;
    @FindBy(xpath = "(//select[@name='quantity'])[1]")
    private WebElement quantityContainer;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;
    @FindBy(css = "#nav-cart-count-container")
    private WebElement cartIcon;
    @FindBy(css = ".a-truncate-cut")
    private WebElement bookName;
    @FindBy(xpath = "(//span[text()='2'])[2]")
    private WebElement quantityNum;
    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement deleteItemBtn;
    @FindBy(xpath = "//span[text()='Hello, nour']")
    private WebElement accountName;

    public WebElement getAccountName() {
        return accountName;
    }

    public WebElement getHelloSignIn() {
        return helloSignIn;
    }

    public WebElement getSignIn() {
        return SignIn;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public WebElement getPasswordBtn() {
        return passwordBtn;
    }

    public WebElement getSignInSubmitBtn() {
        return signInSubmitBtn;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getJavaBook() {
        return JavaBook;
    }

    public WebElement getQuantityContainer() {
        return quantityContainer;
    }

    public WebElement getSearchIcon() {
        return SearchIcon;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getCartIcon() {
        return cartIcon;
    }

    public WebElement getBookName() {
        return bookName;
    }

    public WebElement getQuantityNum() {
        return quantityNum;
    }

    public WebElement getAmazonLoGo() {
        return amazonLoGo;
    }

    public WebElement getDeleteItemBtn() {
        return deleteItemBtn;
    }
}
