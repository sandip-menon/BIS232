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
*/
WebUI.click(findTestObject('Object Repository/Debug/Step_1/Page_Home page/a_Create New Exclusion Request'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/select_Steel'), 
    'Aluminum', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/select_SlabSowBilletFlatPlateS'), 
//    'Sow', true)
WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Identify the class of Al'), 
    '123456')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Full Organization Legal'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Street Address_BIS232Req'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_City_BIS232Request.JSOND'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_State_BIS232Request.JSON'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_ZIP Code_BIS232Request.J'), 
    '22193')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Headquarters Country_BIS'), 
    'Hdc')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Point of Contact Name_BI'), 
    'ehossain')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque'), 
    '703')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_E-mail Address_BIS232Req'), 
    'ehos@mi')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Web Site Address_BIS232R'), 
    'www.hr.com')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Full Organization Legal _1'), 
    'o')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Street Address_BIS232Req_1'), 
    'e')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_City_BIS232Request.JSOND_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_State_BIS232Request.JSON_2'), 
    'e')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_ZIP Code_BIS232Request.J_1'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Headquarters Country_BIS_1'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Website Address_BIS232Re'), 
    'w')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Full Organization Legal _4'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Street Address_BIS232Req_4'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_City_BIS232Request.JSOND_4'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_State_BIS232Request.JSON_3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_ZIP Code_BIS232Request.J_3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Headquarters Country_BIS_3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Point of Contact Name_BI_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Phone Number_BIS232Reque_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_E-mail Address_BIS232Req_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Web Site Address_BIS232R_1'), 
    'w')

WebUI.click(findTestObject('Object Repository/Debug/Step_1/Page_New Exclusion Request Form/input_Web Site Address_btn btn'))

