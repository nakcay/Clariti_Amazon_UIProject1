Feature: Validating add to cart button

  Scenario Outline:
    Given navigate to web page
    And I click on the sign in button and fill the forms up with valid "<email>" and "<password>"
    Then as a user I should be able to see my name on the right hand side of the search icon and to see home page after login
    And I send some keywords to search bar and click on the search icon
    And I click on the java book
    And I click on the quantity container and select two
    And I click on the add to cart button
    And I click to the shopping cart
    Then As a user I should be able to see the correct book and its quantity in the shopping cart
    Examples:
      | email                   | password  |
      | nourakcay1034@gmail.com | Calgary1@1 |

