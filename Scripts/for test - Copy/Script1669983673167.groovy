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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver.Timeouts as Timeouts
import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('Login SME'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('register/fill profile/popup'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select company'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select prof updated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Attach Tab'))

WebUI.click(findTestObject('register/prev buttons/delet attch'), FailureHandling.OPTIONAL)

WebUI.modifyObjectProperty(findTestObject('register/fill profile/New Folder/calendar attach'), 'Xpath', 'not equal', '//td[@id=\'AttachmentDetailsgrid_active_cell\']/div/span/span/span/span', 
    false)

WebUI.click(findTestObject('register/fill profile/New Folder/calendar attach'))

WebUI.click(findTestObject('register/fill profile/New Folder/calender right'))

WebUI.click(findTestObject('register/fill profile/New Folder/calender right'))

int timeout = 1

TestObject object1 = findTestObject('Object Repository/register/fill profile/prev')

TestObject object2 = findTestObject('register/fill profile/New Folder/calender day')

if (WebUI.verifyElementNotPresent(object2, timeout, FailureHandling.STOP_ON_FAILURE))
	
	 {
    WebUI.Click(object1)

    WebUI.click(findTestObject('register/fill profile/New Folder/calender day'))
} else {
    WebUI.click(object2)

 
}

