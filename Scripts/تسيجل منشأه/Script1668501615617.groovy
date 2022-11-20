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

WebUI.setText(findTestObject('register/fill profile/input__CompanyName'), 'test company', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BrandName'), 'brand', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BrandNameAr'), 'براند', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/select lan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/lang arabic'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/next 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/select city'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/city'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__District'), 'test ', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__BuildingNumber'), '4544', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__StreetAddress'), 'Street', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/input__StreetAddressAr'), 'شارع ابو حمد', FailureHandling.STOP_ON_FAILURE)

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

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/focus1'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('register/fill profile/Page_/lable contain'))

WebUI.click(findTestObject('register/fill profile/Page_/lable contain'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('register/fill profile/Page_/input__LocalContentScore'), '4', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/input__btn_CompanySize_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/add contact'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationName'), 'test', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationNameAr'), 'اسم', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationJobTitle'), 'QA', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/input__ContactInformationJobTitleAr'), 'مهندس', FailureHandling.STOP_ON_FAILURE)

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

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/focus2'), 5)

WebUI.focus(findTestObject('register/fill profile/Page_/input__ManagementDetails'))

WebUI.click(findTestObject('register/fill profile/Page_/input__ManagementDetails'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsName'), 'Ashraf fawzy', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsPosition'), 'مهندس مدني', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsEmail'), 's@gmail.com', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('register/fill profile/Page_/select3'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('register/fill profile/li_(61)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('register/fill profile/Page_/input__OwnershipDetailsPhone'), '300411699', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('register/fill profile/Page_/Save8'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_//select4'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_//select 4 in'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_//has mother yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/Page_//input__CompanyHierarchy_ParentCompanyName'), 'الشركه العربيه', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_//select5'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/Page_//select5 in'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register/fill profile/Page_/Page_//input__txtCompanyHierarchy_City'), 'جده', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/save9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/Page_/add nashat'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('register/fill profile/Page_/wakel'), 'وكيل', false)

WebUI.click(findTestObject('register/fill profile/Page_/add wakel'))

WebUI.setText(findTestObject('register/fill profile//search for nashat'), 'لحوم', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile//label_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('register/fill profile/save9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('register/fill profile/Page_/scroll'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('register/fill profile/Page_/Page_/Page_/span__k-icon k-i-calendar attachment'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/span__k-icon k-i-calendar attachment'))

WebUI.click(findTestObject('register/fill profile/Page_/Page_/Page_/a_4'))

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

