Feature:Validating Login Functionality

  Scenario Outline:(Failed Scenario for ScreenShot)Validate that a user is not able to login with invalid password
    Given navigate to web page
    And I click on the sign in button and fill the forms up with valid "<email>" and "<password>"
    Then as a user I should be able to see my name on the right hand side of the search icon and to see home page after login
    Examples:
      | email                   | password  |
      | nourakcay1034@gmail.com | Calgary1@1 |

