@regression
Feature: WomenTest
  As user I want to login into https://magento.softwaretestingboard.com/
@smoke
  Scenario: verifyTheSortByProductNameFilter
    Given I am On Homepage
    When  I Mouse Hover on Women Menu
    And   I Mouse Hover on Tops
    And   I Click on Jackets
    And   I Select Sort By filter "Product Name"
    Then  Verify the products name display in alphabetical order
  @smoke
  Scenario: verifyTheSortByPriceFilter
    Given I am On Homepage
    When  I Mouse Hover on Women Menu
    And   I Mouse Hover on Tops
    And   I Click on Jackets
    And   I Select Sort By Price filter "Price"
    Then  Verify the products price display inLow to High