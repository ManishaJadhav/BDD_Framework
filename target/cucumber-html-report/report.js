$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("New_Login.feature");
formatter.feature({
  "line": 1,
  "name": "E - Gifts Automation feature for Login",
  "description": "",
  "id": "e---gifts-automation-feature-for-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registration Functionality for E - Gifts",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;registration-functionality-for-e---gifts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Registration URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid data as firstname as \"\u003cFirstName\u003e\", Lastname as \"\u003cLastName\u003e\", Mobilenumber as \"\u003cMobile\u003e\",Email as \"\u003cEmail\u003e\", Password \"\u003cpassword\u003e\" and ConfirmPassword \"\u003cConfirmP\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Registration should be successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;registration-functionality-for-e---gifts;",
  "rows": [
    {
      "cells": [
        "url",
        "FirstName",
        "LastName",
        "Mobile",
        "Email",
        "password",
        "ConfirmP"
      ],
      "line": 9,
      "id": "e---gifts-automation-feature-for-login;registration-functionality-for-e---gifts;;1"
    },
    {
      "cells": [
        "http://egifts.atlantickw.com/new-account",
        "Test3",
        "Test3",
        "9870656767",
        "Test3.vtest@gmail.com",
        "manisha123",
        "manisha123"
      ],
      "line": 10,
      "id": "e---gifts-automation-feature-for-login;registration-functionality-for-e---gifts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Registration Functionality for E - Gifts",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;registration-functionality-for-e---gifts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Registration URL \"http://egifts.atlantickw.com/new-account\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid data as firstname as \"Test3\", Lastname as \"Test3\", Mobilenumber as \"9870656767\",Email as \"Test3.vtest@gmail.com\", Password \"manisha123\" and ConfirmPassword \"manisha123\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://egifts.atlantickw.com/new-account",
      "offset": 36
    }
  ],
  "location": "Registration.user_navigates_to_Registration_URL(String)"
});
formatter.result({
  "duration": 71257590140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test3",
      "offset": 39
    },
    {
      "val": "Test3",
      "offset": 60
    },
    {
      "val": "9870656767",
      "offset": 85
    },
    {
      "val": "Test3.vtest@gmail.com",
      "offset": 107
    },
    {
      "val": "manisha123",
      "offset": 141
    },
    {
      "val": "manisha123",
      "offset": 174
    }
  ],
  "location": "Registration.user_enter_valid_data_as_firstname_as_Lastname_as_Mobilenumber_as_Email_as_Password_and_ConfirmPassword(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 6418883010,
  "status": "passed"
});
formatter.match({
  "location": "Registration.Registration_should_be_successful()"
});
formatter.result({
  "duration": 2238182646,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Login Functionality for E - Gifts",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;login-functionality-for-e---gifts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user navigates to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter in using Username as \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;login-functionality-for-e---gifts;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password"
      ],
      "line": 19,
      "id": "e---gifts-automation-feature-for-login;login-functionality-for-e---gifts;;1"
    },
    {
      "cells": [
        "http://egifts.atlantickw.com/login",
        "Test3.vtest@gmail.com",
        "manisha123"
      ],
      "line": 20,
      "id": "e---gifts-automation-feature-for-login;login-functionality-for-e---gifts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Login Functionality for E - Gifts",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;login-functionality-for-e---gifts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user navigates to \"http://egifts.atlantickw.com/login\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter in using Username as \"Test3.vtest@gmail.com\" and Password \"manisha123\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://egifts.atlantickw.com/login",
      "offset": 19
    }
  ],
  "location": "login.user_navigates_to(String)"
});
formatter.result({
  "duration": 19861575204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test3.vtest@gmail.com",
      "offset": 33
    },
    {
      "val": "manisha123",
      "offset": 70
    }
  ],
  "location": "login.user_enter_in_using_Username_as_and_Password(String,String)"
});
formatter.result({
  "duration": 20061649472,
  "status": "passed"
});
formatter.match({
  "location": "login.login_should_be_successful()"
});
formatter.result({
  "duration": 1254102501,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Go to Contact us page",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;go-to-contact-us-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "user navigates to main \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Click on logout",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "contact_us should be successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;go-to-contact-us-page;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 29,
      "id": "e---gifts-automation-feature-for-login;go-to-contact-us-page;;1"
    },
    {
      "cells": [
        "http://egifts.atlantickw.com/"
      ],
      "line": 30,
      "id": "e---gifts-automation-feature-for-login;go-to-contact-us-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Go to Contact us page",
  "description": "",
  "id": "e---gifts-automation-feature-for-login;go-to-contact-us-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "user navigates to main \"http://egifts.atlantickw.com/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Click on logout",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "contact_us should be successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://egifts.atlantickw.com/",
      "offset": 24
    }
  ],
  "location": "Contact_us.user_navigates_to(String)"
});
formatter.result({
  "duration": 42687431501,
  "status": "passed"
});
formatter.match({
  "location": "Contact_us.click_on_logout()"
});
formatter.result({
  "duration": 8731331461,
  "status": "passed"
});
formatter.match({
  "location": "Contact_us.contact_us_should_be_successful()"
});
formatter.result({
  "duration": 5774545960,
  "status": "passed"
});
});