@regression
Feature: MenTest
  As user I want to login into https://magento.softwaretestingboard.com/
@sanity
  Scenario: userShouldAddProductSuccessFullyToShoppingCart
    Given I am On Homepage
    When  I Mouse Hover on Men Menu
    And   I Mouse Hover on Bottoms
    And   I Click on Pants
    And   I MouseHover On Cronus Yoga Pant and click on size
    And   I Mouse Hover on product name Cronus Yoga Pant and click on colourBlack
    And   I Mouse Hover on product name‘Cronus Yoga Pant’ and click on Add To Cart Button
    Then  Verify the text "You added Cronus Yoga Pant to your shopping cart."
    And   Click on shopping cart Link into message
    Then  Verify the text Message "Shopping Cart"
    Then  Verify the product name "Cronus Yoga Pant"
    Then  Verify the product size "32"
    Then  Verify the product colour "Black"