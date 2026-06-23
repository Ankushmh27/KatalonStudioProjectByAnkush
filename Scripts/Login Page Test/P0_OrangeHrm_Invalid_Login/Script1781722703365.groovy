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

WebUI.openBrowser(GlobalVariable.QA)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('InvalidLogin_Object/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('InvalidLogin_Object/input_Password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('InvalidLogin_Object/button_Login'))

// Wait for the error message
WebUI.waitForElementVisible(findTestObject('InvalidLogin_Object/div_Invalid credentials'), 10)

// Capture the error message
String actualError = WebUI.getText(findTestObject('InvalidLogin_Object/div_Invalid credentials'))

String expectedError = 'Invalid credentials'

// Print the error message
println('Error Message: ' + actualError)

// Validate the error message
WebUI.verifyMatch(actualError, expectedError, false)

println('PASS: Invalid credentials! User is not logged in.')

// Close browser
WebUI.closeBrowser()

