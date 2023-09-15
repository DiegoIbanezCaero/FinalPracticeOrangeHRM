package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import Pages.LoginPage;
import Utilities.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("I set the user name field with {string}")
    public void setUserName(String userName) throws InterruptedException {
        Thread.sleep(2000);
        loginPage.setUserNameTextBox(userName);
    }

    @And("I set the password field with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on the login button")
    public void clickOnLoginButton() throws InterruptedException {
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
    }

    @Then("An error message that says {string} should be displayed")
    public void verifyLoginErrorMessage(String errorMessage){

        Assertions.assertTrue(loginPage.isErrorTextDisplayed(errorMessage));
    }
}
