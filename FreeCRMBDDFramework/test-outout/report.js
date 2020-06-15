$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/tuna/Documents/WellsFargo/Learning/java-learning/FreeCRMBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login Page is FREE CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login In button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.user_already_on_login_page()"
});
formatter.result({
  "duration": 5473522461,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 18146075,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 6616822657,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 710387710,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_submits_login()"
});
formatter.result({
  "duration": 101763158,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 6302203,
  "status": "passed"
});
});