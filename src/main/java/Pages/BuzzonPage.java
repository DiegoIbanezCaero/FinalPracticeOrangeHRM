package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzonPage {

    WebDriver driver;

    @FindBy(xpath = "//textarea[contains(@class, 'buzz')]")
    WebElement postTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement postButton;
    @FindBy(id = "oxd-toaster_1")
    WebElement correctMessage;
    public BuzzonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setPostTextBox(String post){
        postTextBox.sendKeys(post);
    }
    public void clickOnBuzzonButton() {postButton.click();
    }
    public boolean CorrectMessageIsDisplayed(){
        boolean correctMessageIsDisplayed = correctMessage.isDisplayed();
        return correctMessageIsDisplayed;
    }

}
