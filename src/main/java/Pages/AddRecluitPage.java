package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRecluitPage {
    WebDriver driver;
    @FindBy(name = "firstName")
    WebElement firstNameTextBox;
    @FindBy(name = "middleName")
    WebElement middleNameTextBox;
    @FindBy(name = "lastName")
    WebElement lastNameTextBox;
    @FindBy(xpath = " (//input[@class = 'oxd-input oxd-input--active'])[2]")
    WebElement EmailTextBox;
    //
    @FindBy(xpath = " //div[@class='oxd-select-text-input']")
    WebElement VancancyCombo;
    //
    @FindBy(xpath = " /html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    WebElement ContactTextBox;
    @FindBy(xpath = "//input[contains(@placeholder, 'words...')]")
    WebElement KeywordsTextBox;
    @FindBy(xpath = "//textarea")
    WebElement NotesTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SaveButton;
    @FindBy(xpath = "//h6[contains(@class, 'text')]")
    WebElement dashboardTitle;


    public AddRecluitPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean pageDashboardTitleIsDisplayed(){
        boolean pageTitleDashBoardIsDisplayed = dashboardTitle.isDisplayed();
        return pageTitleDashBoardIsDisplayed;
    }
    public void setFirstNameTextBox(String firstName){
        firstNameTextBox.sendKeys(firstName);
    }
    public void setMiddleNameTextBox(String middleName){
        middleNameTextBox.sendKeys(middleName);
    }
    public void setLastNameTextBox(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }
    public void setEmailTextBox(String email){
        EmailTextBox.sendKeys(email);
    }
    public void setContactTextBox(String contact){
        ContactTextBox.sendKeys(contact);
    }
    public void setKeywordsTextBox(String keywords){
        KeywordsTextBox.sendKeys(keywords);
    }
    public void setNotesTextBox(String notes){
        NotesTextBox.sendKeys(notes);
    }
    //
    public void setVancancyCombo(String vacancy){
        VancancyCombo.sendKeys(vacancy);
    }
    //
    public void clickOnSaveButton() {SaveButton.click();
    }

}
