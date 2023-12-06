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

WebUI.navigateToUrl('https://www.myntra.com/')

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.mouseOver(findTestObject('Object Repository/Page_Casual Shoes For Men - Buy Casual  Fla_af36c9/Page_Online Shopping for Women, Men, Kids F_27b4d1/a_Home  Living'))

WebUI.click(findTestObject('Object Repository/Page_Casual Shoes For Men - Buy Casual  Fla_af36c9/Page_Home and Living - Buy Interior Decorat_fc6ae1/a_Bed Linen  Furnishing'))

WebUI.click(findTestObject('Object Repository/Page_Casual Shoes For Men - Buy Casual  Fla_af36c9/Page_Bedding  Buy Bedding Online in India a_16d926/label_Bundles'))

WebUI.click(findTestObject('Object Repository/Page_Casual Shoes For Men - Buy Casual  Fla_af36c9/Page_Bedding  Buy Bedding Online in India a_16d926/div_Single Styles_common-checkboxIndicator'))

