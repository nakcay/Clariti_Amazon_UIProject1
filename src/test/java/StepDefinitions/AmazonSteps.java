package StepDefinitions;

import Pages.Amazon_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonSteps {
    Amazon_POM ap = new Amazon_POM();

    @Given("navigate to web page")
    public void navigateToWebPage() {
        BasicDriver.getDriver().get("https://www.amazon.ca/");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @Then("as a user I should be able to see my name on the right hand side of the search icon and to see home page after login")
    public void asAUserIShouldBeAbleToSeeMyNameOnTheRightHandSideOfTheSearchIconAndToSeeHomePageAfterLogin() {
        Assert.assertTrue(ap.getAccountName().isDisplayed());
        Assert.assertTrue(BasicDriver.getDriver().getTitle().contains("Fast Shipping"));

    }


    @And("I click on the sign in button and fill the forms up with valid {string} and {string}")
    public void iClickOnTheSignInButtonAndFillTheFormsUpWithValidAnd(String email, String password) {
        Actions actions = new Actions(BasicDriver.getDriver());
        Action hoveringHelloSignIn = actions.moveToElement(ap.getHelloSignIn()).click().build();
        hoveringHelloSignIn.perform();
        ap.wait.until(ExpectedConditions.visibilityOf(ap.getInputEmail()));
        ap.sendKeysMethod(ap.getInputEmail(), email);
        ap.clickMethod(ap.getContinueBtn());
        ap.sendKeysMethod(ap.getPasswordBtn(), password);
        ap.clickMethod(ap.getSignInSubmitBtn());
    }

    @Then("as a user I should be able to see my account on the login page")
    public void asAUserIShouldBeAbleToSeeMyAccountOnTheLoginPage() {
    }

    @And("I send some keywords to search bar and click on the search icon")
    public void iSendSomeKeywordsToSearchBarAndClickOnTheSearchIcon() {
        ap.sendKeysMethod(ap.getSearchBar(), "java programming books");
        ap.clickMethod(ap.getSearchIcon());
    }

    @And("I click on the java book")
    public void iClickOnTheJavaBook() {
        ap.clickMethod(ap.getJavaBook());
    }

    @And("I click on the quantity container and select two")
    public void iClickOnTheQuantityContainerAndSelectTwo() {
        ap.clickMethod(ap.getQuantityContainer());
        Select select = new Select(ap.getQuantityContainer());
        select.selectByIndex(1);
    }

    @And("I click on the add to cart button")
    public void iClickOnTheAddToCartButton() {
        ap.clickMethod(ap.getAddToCartBtn());
    }


    @And("I click to the shopping cart")
    public void iClickToTheShoppingCart() {
        ap.clickMethod(ap.getCartIcon());
    }

    @Then("As a user I should be able to see the correct book and its quantity in the shopping cart")
    public void asAUserIShouldBeAbleToSeeTheCorrectBookAndItsQuantityInTheShoppingCart() {
        ap.waitMethod(3);
        Assert.assertTrue(ap.getBookName().getText().contains("100+"));
        Assert.assertEquals(ap.getQuantityNum().getText(), "2");
        ap.clickMethod(ap.getDeleteItemBtn()); // This step was Intentionally added because of the cross browser testing.
    }


}