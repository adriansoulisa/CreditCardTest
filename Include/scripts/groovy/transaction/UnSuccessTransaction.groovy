package transaction
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UnSuccessTransaction {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to checkout the pillow")
	def I_want_to_checkout_the_pillow() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demo.midtrans.com/')
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_BUY NOW'))
	}

	@When("I click checkout in the shooping cart page")
	def I_click_checkout_in_the_shooping_cart_page() {
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/div_CHECKOUT'))
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_Continue'))
	}

	@And("I click credit card method and insert the numbers")
	def I_click_credit_card_method_and_insert_the_numbers() {
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_CreditDebit CardPay with Visa, MasterCard_b6120b'))
		WebUI.setText(findTestObject('Object Repository/Page_Sample Store/input_sample-store-1612440358_cardnumber'), GlobalVariable.UnsucsessCardNumber)
		WebUI.setText(findTestObject('Object Repository/Page_Sample Store/input'), GlobalVariable.ExpiryDate)
		WebUI.setText(findTestObject('Object Repository/Page_Sample Store/input_1'), GlobalVariable.CVVNumber)
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_Pay Now'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sample Store/input_Password_PaRes'), GlobalVariable.BankOTP)
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/button_OK'))
		WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_Done'))
	}

	@Then("Verify the transaction will be unsuccessfull")
	def Verify_the_transaction_will_be_unsuccessfull() {
		WebUI.closeBrowser()
	}
}
