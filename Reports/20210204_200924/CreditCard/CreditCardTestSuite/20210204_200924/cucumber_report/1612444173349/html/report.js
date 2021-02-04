$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/adrian.soulisa/Documents/Coba/testing/Include/features/BDD/SuccessTransaction.feature");
formatter.feature({
  "name": "Credit Card Success",
  "description": "  I want to success transaction",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SuccessTransaction"
    }
  ]
});
formatter.scenario({
  "name": "Checkout CreditCard",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SuccessTransaction"
    },
    {
      "name": "@SuccessTransaction"
    }
  ]
});
formatter.step({
  "name": "I want to checkout pillow",
  "keyword": "Given "
});
formatter.match({
  "location": "SuccessTransaction.I_want_to_checkout_pillow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click checkout in the shooping cart",
  "keyword": "When "
});
formatter.match({
  "location": "SuccessTransaction.I_click_checkout_in_the_shooping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click credit card method and insert the number",
  "keyword": "And "
});
formatter.match({
  "location": "SuccessTransaction.I_click_credit_card_method_and_insert_the_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the transaction will be successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "SuccessTransaction.Verify_the_transaction_will_be_successfull()"
});
formatter.result({
  "status": "passed"
});
});