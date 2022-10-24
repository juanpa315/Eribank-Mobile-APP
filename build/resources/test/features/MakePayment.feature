Feature: validate send payment functionality on the eriBank application

  @PaymentSuccessful
  Scenario Outline: As a user Carlos wants to make a payment successfully on the eriBank application
    Given Carlos access to the application with user "Company" and password "company"
    And He makes click on the makePayment button
    When He complete the required data
    |Phone    |Name  |Amount       |Country |
    |<Phone>  |<Name>|<Amount>    |<Country>|
    And He makes click on the button send
    Then The application sends the payment successfully
    Examples:
      |Phone|Name|Amount|Country|
      |365  |Juan|4     |canada |