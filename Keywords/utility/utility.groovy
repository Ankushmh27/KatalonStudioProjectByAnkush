package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CommanUtility {
	@Keyword
	def selectByLabel(TestObject obj, String label) {
		WebUI.selectOptionByLabel(obj, label, false)
	}
	@Keyword
	def selectByValue(TestObject obj, String value) {
		WebUI.selectOptionByValue(obj, value, false)
	}
	@Keyword
	def selectByIndex(TestObject obj, int index) {
		WebUI.selectOptionByIndex(obj, index)
	}
	
	 @Keyword
    def printMessage(String message) {
        println(message)
    }
	@Keyword
	def clickElement(TestObject obj) {
		WebUI.waitForElementClickable(obj, 20)
		WebUI.click(obj)
	}
	
	@Keyword
	boolean verifyElement(TestObject obj) {
		return WebUI.verifyElementPresent(obj, 10)
	}
	
	@Keyword
	def waitForElement(TestObject obj) {
		WebUI.waitForElementVisible(obj, 30)
	}
	@Keyword
	def scroll(TestObject obj) {
		WebUI.scrollToElement(obj, 10)
	}
	@Keyword
	def jsClick(TestObject obj) {
		WebUI.executeJavaScript("arguments[0].click();",
			Arrays.asList(WebUI.findWebElement(obj)))
	}
	@Keyword
	def waitAndClick(TestObject obj) {
		WebUI.waitForElementClickable(obj, 20)
		WebUI.click(obj)
	}
	
	@Keyword
	String getText(TestObject obj) {
		return WebUI.getText(obj)
	}
	@Keyword
	def upload(TestObject obj, String filePath) {
		WebUI.uploadFile(obj, filePath)
	}
	@Keyword
	def screenshot(String name) {
		WebUI.takeScreenshot("Screenshots/" + name + ".png")
	}
	
	@Keyword
	def acceptAlert() {
		WebUI.acceptAlert()
	}
	
	@Keyword
	def dismissAlert() {
		WebUI.dismissAlert()
	}
	
	@Keyword
	def switchWindow(int index) {
		WebUI.switchToWindowIndex(index)
	}
	@Keyword
	boolean verifyText(TestObject obj, String expected) {
		return WebUI.verifyElementText(obj, expected)
	}
}
