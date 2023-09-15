package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    WebDriver driver;

    @FindBy(xpath = "//h6[contains(@class, 'text')]")
    WebElement dashboardTitle;

    @FindBy(xpath = "//a[@href = '/web/index.php/pim/viewMyDetails']")
    WebElement myInfoButton;

    @FindBy(xpath = "//a[contains(@href, 'uzz')]")
    WebElement BuzzonButton;
    @FindBy(xpath = "//a[contains(@href, 'ecruitment')]")
    WebElement RecluitsButton;

    public DashBoardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean pageDashboardTitleIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        boolean pageTitleDashBoardIsDisplayed = dashboardTitle.isDisplayed();
        return pageTitleDashBoardIsDisplayed;
    }

    public void clickOnMyInfoButton() {
        myInfoButton.click();
    }
    public void clickOnBuzzonButton() {
        BuzzonButton.click();
    }
    public void clickOnRecluitButton() {
        RecluitsButton.click();
    }

}