package Steps;

import Pages.AddRecluitPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class AddRecruitStep {
    AddRecluitPage addRecluitPage = new AddRecluitPage(DriverManager.getDriver().driver);
    @And("I set the first name field with {string}")
    public void setFirstName(String firstName){
        addRecluitPage.setFirstNameTextBox(firstName);
    }
    @And("I set the Middle name field with {string}")
    public void setMiddleName(String middleName){
        addRecluitPage.setMiddleNameTextBox(middleName);
    }
    @And("I set the Last name field with {string}")
    public void setLastName(String lastName){
        addRecluitPage.setLastNameTextBox(lastName);
    }
    @And("I set the Email field with {string}")
    public void setEmail(String email){
        addRecluitPage.setEmailTextBox(email);
    }
    @And("I set the Contact field with {string}")
    public void setContact(String contact){
        addRecluitPage.setContactTextBox(contact);
    }
    @And("I set the Keywords field with {string}")
    public void setKeywords(String keywords){
        addRecluitPage.setKeywordsTextBox(keywords);
    }
    @And("I set the Notes field with {string}")
    public void setNotes(String notes){
        addRecluitPage.setNotesTextBox(notes);
    }
    @And("I set the Vacancy field with {string}")
    //
    public void setVacancy(String vacancy){
        addRecluitPage.setVancancyCombo(vacancy);
    }
    @Then("I click on the Save button")
    //
    public void clickOnAddButton() throws InterruptedException{
        addRecluitPage.clickOnSaveButton();
        Assertions.assertTrue(addRecluitPage.pageDashboardTitleIsDisplayed());
        Thread.sleep(2000);
    }
}
