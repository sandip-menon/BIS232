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

WebUI.click(findTestObject('Object Repository/Debug/Step_4/Page_Home page/a_Create New Exclusion Request'))

WebUI.click(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/li_Step 4'))
*/
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_List the Commercial Name'), 
    'Sample')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques'), 
    'Comments 1')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Comments_BIS232Request.J'), 
    '007')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_4'), 
    'Auto')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_6'), 
    'ds')

WebUI.selectOptionByValue(findTestObject('Object Repository/RootC_Analysis/Page_New Exclusion Request Form/select_Please SelectAfghanista'),
	'Argentina', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RootC_Analysis/Page_New Exclusion Request Form/select_Please SelectAfghanista_1'),
	'Bangladesh', true)


WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Current Supplier (if not'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Current Supplier (if not_5'), 
    'china')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Current Supplier (if not_8'), 
    'eu')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No'), 'Yes', 
    true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_7'), 
    'c')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _1'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_8'), 
    'v')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _2'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_9'), 
    'r')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _3'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Manufacturers_BIS232Requ'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Manufacturers_BIS232R'), 
    'w')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _4'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_10'), 
    'u')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _5'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_11'), 
    'i')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _6'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_12'), 
    'g')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/select_No                     _7'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_13'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_16'), 
    'cbp')

WebUI.click(findTestObject('Object Repository/Debug/Step_4/Page_New Exclusion Request Form/input_Comments_btn btn-info fo'))

