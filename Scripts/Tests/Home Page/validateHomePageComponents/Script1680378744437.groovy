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

WebUI.openBrowser('https://www.nomobank.com/')

WebUI.maximizeWindow()

//accepting cookies
WebUI.waitForElementPresent(findTestObject('Property Finance/acceptCookies_btn'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Property Finance/acceptCookies_btn'))

//asserting url loaded correctly
assert WebUI.getUrl() == 'https://www.nomobank.com/'

//asserting nomo header icon loaded correctly
WebUI.verifyElementPresent(findTestObject('Home Page/nomoHeaderIcon_div'), GlobalVariable.globalTimeOut)

//asserting accounts list and it's components are working correctly
WebUI.verifyElementPresent(findTestObject('Home Page/accounts_div'), GlobalVariable.globalTimeOut)

WebUI.mouseOver(findTestObject('Home Page/accounts_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/currentAccounts_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/currentAccounts_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/thinkGlobal_h1'), GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/current-accounts'

WebUI.mouseOver(findTestObject('Home Page/accounts_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/fixedTermDeposits_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/fixedTermDeposits_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/fixed-term-deposits'

WebUI.mouseOver(findTestObject('Home Page/accounts_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/transfers_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/transfers_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/transfers'

//asserting property finance list and it's components are working correctly
WebUI.verifyElementPresent(findTestObject('Home Page/propertyFinance_div'), GlobalVariable.globalTimeOut)

WebUI.mouseOver(findTestObject('Home Page/propertyFinance_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/rentalProperty_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Object Repository/Home Page/rentalProperty_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/investInUK_h1'), GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/rental-property-finance'

WebUI.verifyElementPresent(findTestObject('Home Page/propertyFinance_div'), GlobalVariable.globalTimeOut)

WebUI.mouseOver(findTestObject('Home Page/propertyFinance_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/residentialProperty_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/residentialProperty_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/resi-property-finance'

//asserting nomo list and it's components are working correctly
WebUI.verifyElementPresent(findTestObject('Home Page/nomo_div'), GlobalVariable.globalTimeOut)

WebUI.mouseOver(findTestObject('Home Page/nomo_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/aboutNomo_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/aboutNomo_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/about-us'

WebUI.mouseOver(findTestObject('Home Page/nomo_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/careers_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/careers_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/careers'

//asserting fees component is working correctly
WebUI.verifyElementPresent(findTestObject('Home Page/fees_div'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/fees_div'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

WebUI.waitForElementVisible(findTestObject('Home Page/ourFees_h1'), GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/fees'

//asserting discover list and it's components are working correctly
WebUI.verifyElementPresent(findTestObject('Home Page/discover_div'), GlobalVariable.globalTimeOut)

WebUI.mouseOver(findTestObject('Home Page/discover_div'))

WebUI.verifyElementPresent(findTestObject('Home Page/blog_a'), GlobalVariable.globalTimeOut)

WebUI.click(findTestObject('Home Page/blog_a'))

WebUI.waitForPageLoad(GlobalVariable.globalTimeOut)

WebUI.waitForElementVisible(findTestObject('Home Page/nomoBlog_h1'), GlobalVariable.globalTimeOut)

assert WebUI.getUrl() == 'https://www.nomobank.com/blog'

WebUI.navigateToUrl('https://www.nomobank.com/')

//asserting Help list and components
WebUI.verifyElementPresent(findTestObject('Home Page/help_div'), GlobalVariable.globalTimeOut)

//asserting page headers
WebUI.verifyElementPresent(findTestObject('Home Page/multiCurrencyAccounts_h1'), GlobalVariable.globalTimeOut)

WebUI.scrollToElement(findTestObject('Home Page/madeInLondon_h1'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/madeInLondon_h1'), GlobalVariable.globalTimeOut)

WebUI.scrollToElement(findTestObject('Home Page/feelFree_h1'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/feelFree_h1'), GlobalVariable.globalTimeOut)

WebUI.scrollToElement(findTestObject('Home Page/moneyTransfers_h1'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/moneyTransfers_h1'), GlobalVariable.globalTimeOut)

WebUI.scrollToElement(findTestObject('Home Page/saveForTheFuture_h1'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/saveForTheFuture_h1'), GlobalVariable.globalTimeOut)

WebUI.scrollToElement(findTestObject('Home Page/secureBanking_h3'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/secureBanking_h3'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/fscsProtect_h3'), GlobalVariable.globalTimeOut)

WebUI.verifyElementPresent(findTestObject('Home Page/sharia_h3'), GlobalVariable.globalTimeOut)

WebUI.closeBrowser()
