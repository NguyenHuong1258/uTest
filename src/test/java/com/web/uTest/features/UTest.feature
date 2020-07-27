@SignUp
Feature: Step1 - Creation an account on uTest

  Background:
    Given User access SignUp page of uTest

  @SignUpInvalid
  Scenario Outline: Verify invalid email format when creating an account
    When User inputs email as "<emails>"
    Then the error invalid email should be displayed
    Examples:
      | emails |
      | huong |
      | huong@ |
      | huong@email |
      | huong@email. |

  @SignUpValid
  Scenario: Submit the form successfully
    When User inputs First name as "huong"
    And User input Last name as "nguyen"
    And User inputs Email address as "huongn@email.com"
    And User selects Date of birth with Month as "July"
    And User selects Date of birth with Date as "2"
    And User selects Date of birth with Year as "1990"
    And User selects Language as "Vietnamese"
    And User clicks Next button
    Then User should be redirected to Step two page