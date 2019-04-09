package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.UUID;

public class RegisterStep extends BaseStep {
    String uuid = UUID.randomUUID().toString();

    @Given("^a web browser is at the Hepsiburada home page$")
    public void aWebBrowserIsAtTheHepsiburadaHomePage() {
        geturl();
    }

    @When("^the user click dropdown$")
    public void theUserClickDropdown() {
        findElementClick("myAccount",Pather.id);

    }

    @And("^user clicks on the registration item$")
    public void userClicksOnTheRegistrationItem() {
        findElementClick("register",Pather.id);
    }

    @Then("^user sees the registration form$")
    public void userSeesTheRegistrationForm() {

        waitElement(findElement("firstname",Pather.name,""),TimeOut.LOW);

    }

    @And("^user enters the name$")
    public void userEntersTheName() {
        PageScrolldown();
        findElement("firstname",Pather.id,"").sendKeys("Sevilay");
        
    }

    @And("^user enters the surname$")
    public void userEntersTheSurname() {
        findElement("lastname",Pather.id,"").sendKeys("Test");


    }

    @And("^user enters the email$")
    public void userEntersTheEmail() {
        findElement("email-register",Pather.id,"").sendKeys( "x@test.com.tr");

    }

    @And("^user enters password$")
    public void userEntersPassword() {

        findElement("password-register",Pather.id,"").sendKeys("1A*"+ uuid);
    }

    @And("^user click the agreement checkbox$")
    public void userClickTheAgreementCheckbox() {
       findElementClick("form#form-user > div:nth-of-type(5) > div > label",Pather.cssSelector);
    }

    @And("^user click submit button$")
    public void userClickSubmitButton() {
        findElementClick("form#form-user > div:nth-of-type(6) > button",Pather.cssSelector);

    }

    @And("^driver close$")
    public void driverClose() {
        DriverQuit();
    }
}
