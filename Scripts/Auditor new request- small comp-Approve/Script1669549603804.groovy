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

WebUI.callTestCase(findTestCase('Login Auditor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Audior/Auditor Actions/Focus'))
//WebUI.click(findTestObject('Audior/Auditor Actions/assign'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.mouseOver(findTestObject('Audior/Auditor Actions/My Bascket'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Audior/Auditor Actions/basket not assigned'))

WebUI.click(findTestObject('Audior/Auditor Actions/assign'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Audior/Auditor Actions/Focus'))
//WebUI.click(findTestObject('Audior/Auditor Actions/assign'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.mouseOver(findTestObject('Audior/Auditor Actions/My Bascket'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Audior/Auditor Actions/basket new register'))

WebUI.click(findTestObject('Audior/Auditor Actions/select to take action'))

WebUI.scrollToElement(findTestObject('Audior/Auditor Actions/attach area'), 3)

WebUI.doubleClick(findTestObject('Audior/Auditor Actions/select attach 1'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/accept attach1'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Audior/Auditor Actions/select attach 2'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/accept attch2'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Audior/Auditor Actions/select attch3'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/accept attch3'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Audior/Auditor Actions/select attch4'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/accept attch4'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Audior/Auditor Actions/select attch5'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/Accept attach5'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Audior/Auditor Actions/select action'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audior/Auditor Actions/select action'))

WebUI.click(findTestObject('Audior/Auditor Actions/approve'))

WebUI.setText(findTestObject('Audior/Auditor Actions/Auditor comment'), 'Approved assigned to supervisor ')

WebUI.click(findTestObject('Audior/Auditor Actions/Send to Supervisor'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audior/Auditor Actions/label_no visit'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Audior/Auditor Actions/Submit visit'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('logout/select to logout'))

WebUI.click(findTestObject('logout/logout - Author'))

WebUI.callTestCase(findTestCase('open new Tab supervisor'), [:], FailureHandling.STOP_ON_FAILURE)

