@ignore
Feature: Search for items
  As a customer
  I want to be able to search for any item of my choice
  so that I can choose what to buy.


#Scenario Outline:Customer can search for any item by direct entry into search box
#Given I navigate to Amazon homepage
#When I enter "<Item>" into the search box
#Then a page is displayed showing different "<Item>"
#And I click on one of the search results
#
#Examples:
#|Item     |
#|Computers|
#|Phones   |
#|Clothing |
#|Bags     |
#|         |

#   Examples:
#     |Item     |Types Of Items          |
#     |Computers| computers              |
     #|Phones   | phones                |
     #|Clothing | clothing              |
     #|Bags     | bags                  |
     #|         |No change in display   |



Scenario Outline:Error page is displayed for search
Given I navigate to Amazon homepage
When I enter "<Item>" into the search box
Then an error page is displayed showing no results

Examples:
|Item     |
|NNNNMM   |
|gghgh    |