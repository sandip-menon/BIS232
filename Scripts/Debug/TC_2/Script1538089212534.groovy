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

WebUI.click(findTestObject('Object Repository/Debug/Step_2/Page_Home page/a_Create New Exclusion Request'))

WebUI.click(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/li_Step 2'))
*/
WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Requestor Point of Conta'), 
    'test1')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Point-of-Contact Organiz'), 
    't2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Country Location_BIS232R'), 
    't3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque'), 
    't4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_E-Mail Address_BIS232Req'), 
    't5')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Web Site Address_BIS232R'), 
    't6')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Other Information_BIS232'), 
    't7')

WebUI.click(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Parent Organization Acti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/select_Please Select'), 
    'Manufacturer', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Identify the organizatio'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Identify the country whe'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/textarea_NA'), 'comments')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/select_Please Select          _1'), 
    'U.S Distributor', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Total Requested Annual E'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Kilograms_BIS232Request.'), 
    '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/select_Please Select          _2'), 
    'Unsufficient U.S. Availability', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Please provide comments_'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input__BIS232Request.JSONData.'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_days_BIS232Request.JSOND'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_days_BIS232Request.JSOND_3'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_days_BIS232Request.JSOND_5'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Port 1_BIS232Request.JSO'), 
    '2')

WebUI.click(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Port 1_BIS232Request.JSO_1'))

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Identify the non-U.S. st'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Identify the country whe_1'), 
    'r')

WebUI.setText(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques'), 
    'cmt')

WebUI.click(findTestObject('Object Repository/Debug/Step_2/Page_New Exclusion Request Form/input_Comments_btn btn-info fo'))

