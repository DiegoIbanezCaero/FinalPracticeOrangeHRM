package Steps;


import Pages.RecluitPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class RecruitmenStep {
    RecluitPage recluitPage = new RecluitPage(DriverManager.getDriver().driver);
    @And("I click on the add Button")
    public void clickOnAddButton() throws InterruptedException{
        recluitPage.clickOnAddonButton();
        Thread.sleep(2000);
    }
}
