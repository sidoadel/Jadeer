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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/popup'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select company'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select prof'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('register/fill profile/New Folder/select nashat'))

WebUI.click(findTestObject('register/fill profile/New Folder/select wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/open wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add new wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameAr'), 'وكيل معتمد')

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameEn'), 'good')

WebUI.click(findTestObject('register/fill profile/Page_/save wakel'))

WebUI.setText(findTestObject('register/fill profile/Page_/input__txtfilterAgent'), 'لحوم', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('register/fill profile/save9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/td__AttachmentDetailsgrid_active_cell'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/span__k-select attachment'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/a_4'))

WebUI.uploadFile(findTestObject('register/fill profile/Page_/input__file'), GlobalVariable.attachment, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save10'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/mony page/yes'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/mony page/add mony'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/span__k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/li_2022'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/span_-    -_k-select'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/li_SAR'))

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__Inventory'), '1000000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_//input__Recievables'), '50000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__CurrentAssets'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__NonCurrentAssets'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__ShortTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__CurrentMaturityLongTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__CurrentLiabilities'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__LongTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__NonCurrentLiabilities'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__Equity'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__Revenues'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__GrossProfit'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__NetIncome'), '100000')

WebUI.uploadFile(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/input__financialAttachments'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/save mony'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/Page_/save11'))

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

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_'))

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/input__fdUpload-138'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_ - Copy'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_ - Copy (1)'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/button_2'))

WebUI.scrollToElement(findTestObject('register/fill profile/New Folder/final Page_/h5_'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('register/fill profile/New Folder/final Page_/label_solve'), 2)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_solve'))

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/input__fdUpload-149'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_ - Copy (3)'))

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/input_(QMS)_childitem.AnswerAr'), 'test')

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/input__childitem.AnswerAr'), 'test')

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/input__fdUpload-157'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/button_quality'))

WebUI.scrollToElement(findTestObject('register/fill profile/New Folder/final Page_/h5_'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_solve2'))

WebUI.setText(findTestObject('register/fill profile/New Folder/final Page_/input__childitem.AnswerAr'), 'test')

WebUI.uploadFile(findTestObject('register/fill profile/New Folder/final Page_/input__fdUpload-159'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/label_final - Copy'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/input__Disclaimervalue'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/Send'))

