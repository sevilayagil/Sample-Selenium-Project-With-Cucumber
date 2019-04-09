$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "HepsiBurada Registering",
  "description": "",
  "id": "hepsiburada-registering",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register from the search bar",
  "description": "",
  "id": "hepsiburada-registering;register-from-the-search-bar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "a web browser is at the Hepsiburada home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the registration item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user sees the registration form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters the surname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the email",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click the agreement checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "driver close",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.aWebBrowserIsAtTheHepsiburadaHomePage()"
});
formatter.result({
  "duration": 13595397873,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.theUserClickDropdown()"
});
formatter.result({
  "duration": 978230669,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userClicksOnTheRegistrationItem()"
});
formatter.result({
  "duration": 2930374607,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userSeesTheRegistrationForm()"
});
formatter.result({
  "duration": 5217083524,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userEntersTheName()"
});
formatter.result({
  "duration": 172834252,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userEntersTheSurname()"
});
formatter.result({
  "duration": 124559189,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userEntersTheEmail()"
});
formatter.result({
  "duration": 251600988,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userEntersPassword()"
});
formatter.result({
  "duration": 472673474,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userClickTheAgreementCheckbox()"
});
formatter.result({
  "duration": 134781845,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userClickSubmitButton()"
});
formatter.result({
  "duration": 179946399,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.driverClose()"
});
formatter.result({
  "duration": 1009732413,
  "status": "passed"
});
});