Feature: Validate login functionality in the eriBank app
  @LoginSuccessful
  Scenario: As a User Juan wants to login successful in the eriBank app
    When Juan access to the eriBank application with user "Company" and Password "company"
    Then Juan can login successfully on the eriBank application

  @LoginFailed
  Scenario: As a product Owner, Juan wants to validate that a user cannot login with incorrect access data
    When Juan insert a incorrect username "company2" and password "company2"
    Then The system denies Juan access to the eriBank application