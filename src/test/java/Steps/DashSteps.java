package Steps;

import Pages.DashBoardPage;
import Utilities.DriverManager;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class DashSteps {
    DashBoardPage dashboardPage = new DashBoardPage(DriverManager.getDriver().driver);

    @Then("The home page should be displayed")
    public void verifyDashboardPageIsDisplayed()throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(dashboardPage.pageDashboardTitleIsDisplayed());
    }

    @Then("I click on the my info button")
    public void clickOnButtonMyInfo() throws InterruptedException{
        dashboardPage.clickOnMyInfoButton();
}
    @And("I click on the buzzon button")
    public void clickOnButtonBuzzon() throws InterruptedException{
        dashboardPage.clickOnBuzzonButton();
        Thread.sleep(3000);
    }
    @And("I click on the recruitment button")
    public void clickOnRecriutmentButton() throws InterruptedException{
        dashboardPage.clickOnRecluitButton();
        Thread.sleep(3000);
    }



}
