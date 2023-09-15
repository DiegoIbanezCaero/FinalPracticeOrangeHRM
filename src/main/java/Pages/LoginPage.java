package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement userNameTextBox;

    @FindBy(name = "password")
    WebElement passwordTextBox;
    @FindBy(xpath = "//p[contains(@class, 'alert')]")
    WebElement loginErrorMessage;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserNameTextBox(String userName){
        userNameTextBox.sendKeys(userName);
    }

    public void setPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public boolean isErrorTextDisplayed(String error){
        String actualErrorMessage = loginErrorMessage.getText();
        if(error.equalsIgnoreCase(actualErrorMessage)){
            return true;
        } else {
            return false;
        }
    }
}
