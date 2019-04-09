Feature: HepsiBurada Registering
@register
  Scenario: User registers by successfully completing the registration form
    Given a web browser is at the Hepsiburada home page
    When the user click dropdown
    And user clicks on the registration item
    Then user sees the registration form
    And user enters the name
    And user enters the surname
    And user enters the email
    And user enters password
    And user click the agreement checkbox
    And user click submit button
    And driver close
