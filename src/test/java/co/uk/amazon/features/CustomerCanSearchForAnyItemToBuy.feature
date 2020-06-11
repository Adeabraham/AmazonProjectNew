Feature: Search for items
  As a customer
  I want to be able to search for any item of my choice
  so that I can choose what to buy.

 Scenario Outline:Customer can search for any item by direct entry into search box
   Given I navigate to Amazon homepage
   When I enter "computer" into the search box
   Then a page is displayed showing different "types of items"
   And I click on one of the search results

Examples:
|Item     |TypesOfItems          |
|Computers| computers            |
#|Phones   | phones              |
#|Clothing | clothing            |
#|Bags     | bags                |
#|         |No change in display |


  Scenario Outline:Error page is displayed for search
    Given I navigate to Amazon homepage
    When I enter "Item" into the search box
    Then an error page is displayed showing no results

    Examples:
      |Item     |
      |NNNNMM   |
#      |gghgh    |



#  Scenario:Cannot search with blank search box
#    Given I navigate to Amazon homepage
#    When I did not enter anything into the search box
#    And I click on the search button
#    Then The page remains unchanged
#
# Scenario: Search by department by using drop down button
#   Given I navigate to Amazon homepage
#   When I click on All button
#   And I select clothing
#   And I enter "trousers for men" in the search box
#   Then a page is displayed showing different types of trousers for men
#
#  Scenario: Search by department by using drop down button and blank search box
#    Given I navigate to Amazon homepage
#    When I click on All button
#    And I select clothing
#    And I did not enter anything into the search box
#    Then a page is displayed showing different categories (Women, Men, Girls, Baby) to choose from
#
#  Scenario:Search for computer
#    Given I navigate to Amazon homepage
#    When I enter "computer" into the search box
#    And I select Desktop PCs under Computer & Accessories
#    And I select Dell under Brand
#    And I select £400 - £600 under Price
#    And I select Intel Core i7 under Processor Type
#    Then a page is displayed showing different Intel Core i7 computers to select from


