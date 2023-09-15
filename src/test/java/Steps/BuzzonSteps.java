package Steps;

import Pages.BuzzonPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class BuzzonSteps {
    BuzzonPage buzzonPage = new BuzzonPage(DriverManager.getDriver().driver);

    @And("I Write the message {string} in the Post Space")
    public void setPostMessage(String postMessage) throws InterruptedException {
        buzzonPage.setPostTextBox(postMessage);
        Thread.sleep(2000);
    }
    @And("I click on Post Button")
    public void clickOnPostBuzzon() throws InterruptedException{
        buzzonPage.clickOnBuzzonButton();
        Thread.sleep(2000);
    }
    @Then("The Verification Window will be displayed")
    public void verifycorrectMessageIsDisplayed()throws InterruptedException {
        Assertions.assertTrue(buzzonPage.CorrectMessageIsDisplayed());
    }

}
