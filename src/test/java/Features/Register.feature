Feature: Account Creation for CrowdStreet Platform

@accountCreation
  Scenario: Account Creation for CrowdStreet Platform
  Given a user navigates to the CrowdStreet website using google chrome browser
  When the user clicks on the Create An Account button on the home page
  And the user enters their first name in the first name field
  And the user enters their last name in the last name field
  And the user enters their email in the email field
  And the user enters generates a password and enters it in the password field
  And the user re-enters their new password in the confirm password field
  And the user selects Yes or No from the option radio button with the question are you an accredited investor
  And the user checks or marks the field that says I have read and accepted the terms and conditions
  And the user checks or marks the field that says I am not a robot with ReCAPTCHA tag
  And the user clicks on the blue button that says Create an account at the bottom
  Then the user should be redirected to the CrowdStreet home page with new user profile to the top right
