Feature: Login with a valid credentials

  As a customer I want to login with a valid credentials


  Scenario Outline: Login to app
    Given the app main page is open
    And the user clicks on MyAccount Btn
    When the user enters correct <email> and <password>
    Then the user is logged in

    Examples:
      |email             |password       |
      |user211121@mail.ru|TestUser211121 |

  @Start
  Scenario: Changing language
    Given the user is on main page
    When the user clicks on language button
    Then the language is changed

  Scenario: Move to Children Apparel section
    Given the user is on main page
    And the user clicks on Apparel tag from the header
    When the user clicks on Children section of Apparel drop-down menu
    Then the user moves to Children Apparel section

  Scenario: Change the Relevance Price, high to low
    Given the user is on Children Apparel page
    When the user clicks on Price, high to low from Relevance drop-down menu
    Then the product list is updated by Price, high to low

  Scenario Outline: Checking product description
    Given the user is on Children Apparel page
    When the user clicks on <product> icon
    Then the user is able to see description

    Examples:
      |product                    |
      |Body "Cherry", Long Sleeve |

  Scenario: Logout from app
    Given the user is on product page
    When the user click on MyAccount button from the header
    And the user clicks on SignOut section from drop-down menu
    Then the user logs out