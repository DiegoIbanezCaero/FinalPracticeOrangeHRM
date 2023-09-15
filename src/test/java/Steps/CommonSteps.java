package Steps;

import io.cucumber.java.en.Given;
import Utilities.DriverManager;


public class CommonSteps {

    @Given("I am in OrangeHRM web page")
    public void goToOrangeHRMPage()
    {
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
