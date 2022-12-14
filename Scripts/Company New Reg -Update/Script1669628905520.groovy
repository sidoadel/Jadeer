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
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Login SME'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('register/fill profile/popup'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select company'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Select prof updated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('register/fill profile/input__CompanyName'), 10)

WebUI.setText(findTestObject('register/fill profile/input__CompanyName'), 'test company', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BrandName'), 'brand', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BrandNameAr'), '??????????', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/select lan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/lang arabic'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/next 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/select city'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/city'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__District'), 'test ', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BuildingNumber'), '4544', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__StreetAddress'), 'Street', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__StreetAddressAr'), '???????? ?????? ??????', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__GeoLocation'), 'https://www.google.com/maps?cid=18374608280476341734', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/next2'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/next3'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/next3'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/label_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/input__btn_SAGIA_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/input__btn_ZAKAT_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('register/fill profile/label_company4'), 5)

WebUI.click(findTestObject('register/fill profile/label_company4'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__LocalContentScore'), '4', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/input__btn_CompanySize_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/add contact'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/prev buttons/delete contact'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('register/fill profile/Page_/add contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationName'), 'test', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationNameAr'), '??????', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationJobTitle'), 'QA', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationJobTitleAr'), '??????????', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('register/fill profile/Page_/conact type'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/conact type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/li_'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationEmail'), 'sayed@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('register/fill profile/Page_/country code'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/country code'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/li_(20)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationMobile'), '01552020596', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/savecontacr'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save7'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile//Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile//Ownership_Email'), 's@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile//select 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/li_(968)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile//Ownership_Phone'), '300411696', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile//select2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/li_(971)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile//Ownership_Mobile'), '300411696', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/focus2'), 5)

WebUI.focus(findTestObject('register/fill profile/Page_/input__ManagementDetails'))

int timeout = 1

TestObject object1 = findTestObject('register/fill profile/Page_/input__OwnershipDetailsName')

TestObject object2 = findTestObject('register/fill profile/Page_/input__ManagementDetails')

if (WebUI.verifyElementPresent(object1, timeout, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.doubleClick(object2)
} else {
    WebUI.click(object2)
}

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsName'), 'Ashraf fawzy', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsPosition'), '?????????? ????????', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsEmail'), 's@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/select3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/li_(61)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsPhone'), '300411699', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Save8'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/select4'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/slect4in'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/label_mother yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('register/fill profile/input__CompanyHierarchy_ParentCompanyName'), 2)

WebUI.setText(findTestObject('register/fill profile/input__CompanyHierarchy_ParentCompanyName'), '???????????? ??????????????', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/select5'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/5in'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__txtCompanyHierarchy_City'), '??????', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/prev buttons/delete wakel'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('register/fill profile/New Folder/select nashat'))

WebUI.click(findTestObject('register/fill profile/New Folder/select wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/New Folder/open wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add new wakel'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameAr'), '???????? ??????????')

WebUI.setText(findTestObject('register/fill profile/Page_/input__AgentNameEn'), 'good')

WebUI.click(findTestObject('register/fill profile/Page_/save wakel'))

WebUI.setText(findTestObject('register/fill profile/Page_/input__txtfilterAgent'), '????????', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/register/fill profile/label_grid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/btnClassificationSave'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/prev buttons/Ignore button'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/prev buttons/delet attch'), FailureHandling.OPTIONAL)

WebUI.modifyObjectProperty(findTestObject('register/fill profile/New Folder/calendar attach'), 'Xpath', 'not equal', '//td[@id=\'AttachmentDetailsgrid_active_cell\']/div/span/span/span/span', 
    false)

WebUI.click(findTestObject('register/fill profile/New Folder/calendar attach'))

WebUI.click(findTestObject('register/fill profile/New Folder/calender right'))

WebUI.click(findTestObject('register/fill profile/New Folder/calender day'))

WebUI.uploadFile(findTestObject('register/fill profile/Page_/input__file'), GlobalVariable.attachment, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save10'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/mony page/yes'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/add mony'))

WebUI.click(findTestObject('register/fill profile/Page_/select year'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/li_2022'))

WebUI.click(findTestObject('register/fill profile/New Folder/Select money'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/li_SAR'))

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__Inventory'), '1000000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__Recievables'), '50000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__CurrentAssets'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__NonCurrentAssets'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__ShortTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__CurrentMaturityLongTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__CurrentLiabilities'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__LongTermDebt'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__NonCurrentLiabilities'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__Equity'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__Revenues'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__GrossProfit'), '100000')

WebUI.setText(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__NetIncome'), '100000')

WebUI.uploadFile(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__financialAttachments'), GlobalVariable.attachment)

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/save mony'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/save11'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/insurance Page_/label_no'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/insurance Page_/span__insurance'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/insurance Page_/li_insurance'))

WebUI.click(findTestObject('register/fill profile/Page_/mony page/Page_/Page_/input__btnSubmit_Insurance'))

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

WebUI.click(findTestObject('register/fill profile/Btn question'))

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

WebUI.focus(findTestObject('register/fill profile/New Folder/final Page_/div_Close'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/div_Close'))

WebUI.click(findTestObject('register/fill profile/New Folder/final Page_/send OK'))

WebUI.mouseOver(findTestObject('register/fill profile/header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('logout/select to logout'))

WebUI.click(findTestObject('logout/logout-SME'))

WebUI.callTestCase(findTestCase('open new Tab auditor'), [:], FailureHandling.STOP_ON_FAILURE)

