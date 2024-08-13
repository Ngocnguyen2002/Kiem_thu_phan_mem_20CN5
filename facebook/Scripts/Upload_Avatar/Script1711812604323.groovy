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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 'kongminh@imail.edu.vn')

WebUI.setEncryptedText(findTestObject('Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'R2dZ4hvJ2uilYZwFN98SBw==')

WebUI.sendKeys(findTestObject('Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/div_Tm hiu v quyn ring t_x78zum5 xdt5ytf x1_60d8a9'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/span_Thm nh'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/div_Ti nh ln'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/i_Chn nh i din_x1b0d499 xi3auck'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/i_Chn nh i din_x1b0d499 xi3auck'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/div_Lu'))

WebUI.closeBrowser()

