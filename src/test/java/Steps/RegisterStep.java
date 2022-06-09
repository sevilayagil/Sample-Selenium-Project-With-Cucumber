package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterStep extends BaseStep
{
    @Given("^a user navigates to the CrowdStreet website using google chrome browser$")
    public void aUserNavigatesToTheCrowdStreetWebsiteUsingGoogleChromeBrowser()
    {
        geturl();
    }

    @When("^the user clicks on the Create An Account button on the home page$")
    public void theUserClicksOnTheCreateAnAccountButtonOnTheHomePage()
    {
        //Capture Account Creation Button Using CSS Locator and Link
        WebElement elm = driver.findElement(By.cssSelector("a[href*='/accounts/create-account']"));

        //Locate String Text of Button on Page
        String s = elm.getText();
        System.out.println("Text is: " + s);

        //Click on Create an Account Button
        elm.click();
    }

    @And("^the user enters their first name in the first name field$")
    public void theUserEntersTheirFirstNameInTheFirstNameField()
    {
        //Verify that the User is Redirected to Account Sign Up Page
        checkTextPresent("Let’s build your ideal portfolio");

        //Enter the First Name of User in the Text Field
        firstName("farhan");
    }

    @And("^the user enters their last name in the last name field$")
    public void theUserEntersTheirLastNameInTheLastNameField()
    {
        //Verify that the User is Redirected to Account Sign Up Page
        checkTextPresent("Let’s build your ideal portfolio");

        //Enter the First Name of User in the Text Field
        lastName("ishraq");
    }

    @And("^the user enters their email in the email field$")
    public void theUserEntersTheirEmailInTheEmailField()
    {
        //Verify that the User is Redirected to Account Sign Up Page
        checkTextPresent("Let’s build your ideal portfolio");

        //Enter the First Name of User in the Text Field
        emailAddress("crowdstreetautomation@gmail.com");
    }

    @And("^the user enters generates a password and enters it in the password field$")
    public void theUserEntersGeneratesAPasswordAndEntersItInThePasswordField()
    {
        //Verify that the User is Redirected to Account Sign Up Page
        checkTextPresent("Let’s build your ideal portfolio");

        //Enter the First Name of User in the Text Field
        passwordCreation("secretPassword$12@3");
    }

    @And("^the user re-enters their new password in the confirm password field$")
    public void theUserReEntersTheirNewPasswordInTheConfirmPasswordField()
    {
        //Verify that the User is Redirected to Account Sign Up Page
        checkTextPresent("Let’s build your ideal portfolio");

        //Enter the First Name of User in the Text Field
        passwordRedo("secretPassword$12@3");
    }

    @And("^the user selects Yes or No from the option radio button with the question are you an accredited investor$")
    public void theUserSelectsYesOrNoFromTheOptionRadioButtonWithTheQuestionAreYouAnAccreditedInvestor()
    {
        //Verify if the Accredited Investor Text is Visible with Radio Buttons
        verifyAccreditedInvestorTextVisible();

        //Select the Option No (default) for the Question (Are you an accredited investor?)
        selectRadioButtonForAccreditedInvestor("no");

        //Select the Option Yes (select radio button) for the Question (Are you an accredited investor?)
        selectRadioButtonForAccreditedInvestor("yes");
    }

    @And("^the user checks or marks the field that says I have read and accepted the terms and conditions$")
    public void theUserChecksOrMarksTheFieldThatSaysIHaveReadAndAcceptedTheTermsAndConditions()
    {
        //First Check if the Terms and Conditions Field is Visible and Displayed
        verifyTheTermsAndConditions();

        //Select and Unselect the Check Box for Accepting Terms and Conditions
        acceptTheTermsAndConditions();
    }

    @And("^the user checks or marks the field that says I am not a robot with ReCAPTCHA tag$")
    public void theUserChecksOrMarksTheFieldThatSaysIAmNotARobotWithReCAPTCHATag()
    {
        //Bypass the ReCaptcha Tag from the Pop Up Frame
        bypassTheRecaptchaBox();
    }

    @And("^the user clicks on the blue button that says Create an account at the bottom$")
    public void theUserClicksOnTheBlueButtonThatSaysCreateAnAccountAtTheBottom()
    {
        //Click on the Blue Button to Create an Account on CrowdStreet Website
        clickOnTheBlueCreateAccountButton();
    }

    @Then("^the user should be redirected to the CrowdStreet home page with new user profile to the top right$")
    public void theUserShouldBeRedirectedToTheCrowdStreetHomePageWithNewUserProfileToTheTopRight()
    {
        //Account Has Been Successfully Created and Driver can Close/Quit
        DriverQuit();
    }
}
