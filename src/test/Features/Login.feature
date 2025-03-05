Feature: login
  Scenario: To verify the user is able to login

    Given User launch chrome browser
    When User open Url "https://admin-demo.nopcommerce.com/login"
    Then Enter username "admin@yourstore.com" and password "admin"
    And click on login
    Then verify the page title "Dashboard / nopCommerce administration"
    And logout from the page
    Then verify the homepage title "nopCommerce demo store. Login"
    And close the browser