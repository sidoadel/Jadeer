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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/popup'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select company'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select prof'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/insurance Page_/label_no'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/insurance Page_/span__insurance'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/insurance Page_/li_insurance'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__btnSubmit_Insurance'))

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (1)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (2)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (3)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (4)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (5)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (6)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (7)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (8)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (9)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (10)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (11)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (12)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (13)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_yes - Copy (14)'))

WebUI.click(findTestObject('register/fill profile/button_final'))

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/New Folder//label_'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/label_'))

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__fdUpload-138'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/label_ - Copy'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/label_ - Copy (1)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/button_2'))

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_final'), 3)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_scroll'))

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__fdUpload-149'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/label_ - Copy (3)'))

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/Page_/input_(QMS)_childitem.AnswerAr'), 'test')

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__childitem.AnswerAr'), 'test')

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__fdUpload-157'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/button_quality'))

WebUI.scrollToElement(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_final'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_final'), 3)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_final'))

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__childitem.AnswerAr'), 'test')

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__fdUpload-159'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/Page_/label_final - Copy'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Page_/input__Disclaimervalue'))

