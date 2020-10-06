@ApiKey
Feature: Validate API keys feature

  Background:
    Given User signIn successfully
    And User open APIKeys page

 @Create
  Scenario: Create an API key
    When User enter API name as "HNGTest"
    And User click Generate
    Then New API is created

  @Edit
  Scenario: Edit name of API
    When User click Edit of API as "HNGTest"
    And edit to a new name as "HNGEdit"
    Then the name should be updated

   @Delete
   Scenario: Delete the API
     When User click Delete API as "HNGEdit"
     Then the API should be deleted successfully






