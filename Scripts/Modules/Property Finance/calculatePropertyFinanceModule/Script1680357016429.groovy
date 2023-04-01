import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.nomobank.com/rental-property-finance')

WebUI.maximizeWindow()

//accepting cookies
WebUI.waitForElementPresent(findTestObject('Property Finance/acceptCookies_btn'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Property Finance/acceptCookies_btn'))

//switching to the iframe containing the calculator
WebUI.scrollToElement(findTestObject('Property Finance/applyForPropertyFin_h4'), GlobalVariable.globalTimeOut)

WebUI.switchToFrame(findTestObject('Property Finance/propertyFinanceCalculator_iframe'), GlobalVariable.globalTimeOut)

WebUI.waitForElementVisible(findTestObject('Property Finance/estimateProperty_txt'), GlobalVariable.globalTimeOut)

//deleting the default value to avoid overlapping with new value
WebUI.sendKeys(findTestObject('Property Finance/estimateProperty_txt'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Property Finance/estimateProperty_txt'), Keys.chord(Keys.BACK_SPACE))

//adding the property value passed from test case call
WebUI.setText(findTestObject('Property Finance/estimateProperty_txt'), propertyValue)

WebUI.waitForElementVisible(findTestObject('Property Finance/estimateRentalIncome_txt'), GlobalVariable.globalTimeOut)

//adding rental income passed from test case call
WebUI.setText(findTestObject('Property Finance/estimateRentalIncome_txt'), rentalIncome)

WebUI.waitForElementVisible(findTestObject('Property Finance/downPayment_txt'), GlobalVariable.globalTimeOut)

//adding down payment passed from test case call
WebUI.setText(findTestObject('Property Finance/downPayment_txt'), downPayment)

//if condition for the happy scenario and it's default value is equal to true
if(isHappyScenarioFlow == true) {
	
	WebUI.waitForElementClickable(findTestObject('Property Finance/fixedRate_select'), GlobalVariable.globalTimeOut)
	
	WebUI.click(findTestObject('Property Finance/fixedRate_select'))
	
	WebUI.scrollToElement(findTestObject('Property Finance/downPayment_txt'), GlobalVariable.globalTimeOut)

//selecting 5 years option istead of 2 and default value is false
if(isFiveYears == true) {
	
	WebUI.click(findTestObject('Property Finance/fiveYearFixedRate_li'))
	
}else{
	
	WebUI.click(findTestObject('Property Finance/twoYearFixedRate_li'))
	}
	
}else {
	
	//asserting that the error message is equal the error message passed from test case call
	WebUI.waitForElementVisible(findTestObject('Property Finance/downPaymentAlert_div'), GlobalVariable.globalTimeOut)
	
	actualAlertMessage = WebUI.getText(findTestObject('Property Finance/downPaymentAlert_div'))
	
	assert expectedAlertMessage == actualAlertMessage
	
}

//getting the finance amount and monthly amount and asserting that they are equal to the expected value
WebUI.scrollToElement(findTestObject('Property Finance/financeAmount_h2'), GlobalVariable.globalTimeOut)

outputFinanceAmount = WebUI.getText(findTestObject('Property Finance/financeAmount_h2'))

//cleaning the string from unwanted characters using stringSplitAtSpace module
actualFinanceAmount = WebUI.callTestCase(findTestCase('Modules/String Manipulation/stringSplitAtSpace'), [('desiredString'):outputFinanceAmount])

assert expectedFinanceAmount == actualFinanceAmount

outputMonthlyCost = WebUI.getText(findTestObject('Property Finance/monthlyCosts_h3'))

actualMonthlyCost = WebUI.callTestCase(findTestCase('Modules/String Manipulation/stringSplitAtSpace'), [('desiredString'):outputMonthlyCost])

assert expectedMonthlyCost == actualMonthlyCost

WebUI.closeBrowser()