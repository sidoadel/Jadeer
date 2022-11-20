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

WebUI.click(findTestObject('register/prev buttons/input_Select files_btn_Attachment_Prev'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/span__k-select'))

WebUI.click(findTestObject('register/fill profile/Page_/div__k-multiselect-wrap k-floatwrap'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add new wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameAr'), 'وكيل معتمد')

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameEn'), 'good')

WebUI.click(findTestObject('register/fill profile/Page_/save wakel'))

WebUI.setText(findTestObject('register/fill profile/Page_/input__txtfilterAgent'), 'لحوم', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.focus(findTestObject('register/fill profile/Page_/Page_/Page_/td_'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/td_'))

WebUI.click(findTestObject('register/fill profile/save9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('register/fill profile/Page_/input__file'), 'C:\\\\Users\\\\andalosya\\\\Desktop\\\\double sign test.docx', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save10'), FailureHandling.STOP_ON_FAILURE)

