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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://yg168.online/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/a_'))

WebUI.setText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input__user_id'), 'nct001')

WebUI.setEncryptedText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input__password'), 
    'vYld9WTXuBj5x/d5Ggu7vQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input__confirm_password'), 
    'vYld9WTXuBj5x/d5Ggu7vQ==')

WebUI.setText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input__full_name'), 'ncttest sfdsf')

WebUI.setText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input__phone'), '01123454646')

WebUI.setText(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/input_Referral id must be correct and exist_483e26'), 
    '7842')

WebUI.click(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/button_'))

WebUI.click(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/button_OK'))

WebUI.click(findTestObject('Object Repository/register/Page_YG168  Best Online Casino In Myanmar/button_OK'))

