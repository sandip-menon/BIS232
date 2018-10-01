import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('https://ita232webapp.azurewebsites.net/')

WebUI.click(findTestObject('Object Repository/Debug/Step_5/Page_Home page/a_Create New Exclusion Request'))

WebUI.click(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/li_Step 5'))
*/
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Company Name_BIS232Reque'), 
    'Test Corp')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Name of Authorizing Offi'), 
    'Carrington')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Title of Authorizing Off'), 
    'QA lead')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque'), 
    '7035897042')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque_5'), 
    'carr@')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Point-of-Contact Name_BI'), 
    'Ehossain')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Title_BIS232Request.JSON'), 
    'QA Manager')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_E-mail Address_BIS232Req'), 
    '@')

WebUI.setText(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque_7'), 
    '7')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_5/Page_New Exclusion Request Form/select_No'), 'Yes', 
    true)

