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

WebUI.callTestCase(findTestCase('Login Supervisor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Audior/Auditor Actions/My Bascket'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Supervisor/Basket new reg'))

WebUI.click(findTestObject('Supervisor/Select action'))

WebUI.scrollToElement(findTestObject('Supervisor/Supervisor comment'), 0)

WebUI.setText(findTestObject('Supervisor/Supervisor comment'), 'Approved')

WebUI.click(findTestObject('Supervisor/Suppervisor Approve'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('logout/select to logout'))

WebUI.click(findTestObject('logout/Logout Super'))

