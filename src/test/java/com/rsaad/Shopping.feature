Feature: Shopping
  The Shoppingbasket contains a list of purchased items.

  Scenario: Getting total in basket for empty basket
    Given Empty basket
    When Calculate total price
    Then Result should be 0.0

  Scenario: Getting total in basket for a basket with one item
    Given Basket with one item
    When Calculate total price
    Then Result should be 100.0

  Scenario: Getting total in basket for a basket with multiple items
    Given Basket with multiple items
    When Calculate total price
    Then Result should be 500.0