$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/adrian.soulisa/Music/CreditCardTest/Include/features/BDD/UnsuccessfullTransaction.feature");
formatter.feature({
  "name": "Credit Card Unsuccess",
  "description": "  I want to unsuccess transaction",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UnsuccessTransaction"
    }
  ]
});
formatter.scenario({
  "name": "Checkout unsuccessfull Credit Card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UnsuccessTransaction"
    },
    {
      "name": "@UnsuccessTransaction"
    }
  ]
});
formatter.step({
  "name": "I want to checkout the pillow",
  "keyword": "Given "
});
formatter.match({
  "location": "UnSuccessTransaction.I_want_to_checkout_the_pillow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click checkout in the shooping cart page",
  "keyword": "When "
});
formatter.match({
  "location": "UnSuccessTransaction.I_click_checkout_in_the_shooping_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click credit card method and insert the numbers",
  "keyword": "And "
});
formatter.match({
  "location": "UnSuccessTransaction.I_click_credit_card_method_and_insert_the_numbers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the transaction will be unsuccessfull",
  "keyword": "Then "
});
formatter.match({
  "location": "UnSuccessTransaction.Verify_the_transaction_will_be_unsuccessfull()"
});
formatter.result({
  "status": "passed"
});
});