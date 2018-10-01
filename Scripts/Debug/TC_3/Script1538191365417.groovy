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

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_Home page/a_Create New Exclusion Request'))

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/li_Step 3'))
*/
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/textarea_Exclusion Request Pro'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques'), 
    'Comments 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/select_Please SelectASTMSAEBri'), 
    'ASTM', true)

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Designation_BIS232Reques'), 
    'BD')

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Slab_BIS232Request.JSOND'))

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Beams_BIS232Request.JSON'))

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Blooms_BIS232Request.JSO'))

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Use the textboxes on the'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Use the textboxes on the_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Use the textboxes on the_3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_1'), 
    'c')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum _BIS232Request.J'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum _BIS232Request.J_1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum _BIS232Request.J_3'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum _BIS232Request.J'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum _BIS232Request.J_1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum _BIS232Request.J_3'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_2'), 
    'c')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_1'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_3'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_5'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_7'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_9'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_1'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_3'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_5'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_7'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_9'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Hardness (specify method'), 
    'Method')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_11'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_13'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_15'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_11'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_13'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_15'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_16'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Temperature_BIS232Reques'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Temperature_BIS232Reques_1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Temperature_BIS232Reques_3'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Other_BIS232Request.JSON'), 
    'Test Method')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Joules_BIS232Request.JSO'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Joules_BIS232Request.JSO_1'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Joules_BIS232Request.JSO_3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_ Shear_BIS232Request.JSO'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_ Shear_BIS232Request.JSO_1'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_ Shear_BIS232Request.JSO_3'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_17'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData.'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData._1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData._3'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_17'), 
    '03')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData._5'), 
    '03')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData._7'), 
    '03')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input__BIS232Request.JSONData._9'), 
    '03')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Composition (e.g. Zn Al'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Composition (e.g. Zn Al _1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Composition (e.g. Zn Al _3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Minimum_BIS232Request.JS_19'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_grams psq_BIS232Request.'), 
    '02')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Maximum_BIS232Request.JS_19'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_grams psq_BIS232Request._1'), 
    '03')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Specify any Additional M'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Specify any Additional M_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Specify any Additional M_3'), 
    't')

WebUI.setText(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/textarea_Comments_BIS232Reques_3'), 
    'c')

WebUI.click(findTestObject('Object Repository/Debug/Step_3/Page_New Exclusion Request Form/input_Comments_btn btn-info fo'))

