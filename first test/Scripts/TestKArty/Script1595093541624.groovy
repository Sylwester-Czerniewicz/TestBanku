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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
WebUI.openBrowser("http://demo.pekao24.pl/MCP/client/logon/ClientLogonDemo.html")
WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input__parUsername'))
WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input__parUsername'), "123456")
WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input__butLogin'))
WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/input__f0'), "0")
WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/input__f4'), "0")
WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/input__f5'), "0")
WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/input__f7'), "0")
WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/input_Wstecz_fSubmit'))
WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/a_Karty'))
IF_RUN(WebUI.verifyElementText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/p_42133587'),"4213********3587")) {
	WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/a_Operacje'))
	WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/a_Szczegy karty'))	
	WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/span_Aktywuj kart'))
	WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input_Podaj 8 ostatnich cyfr z numeru aktywowanej karty_parCardDigitsTmp'))
	WebUI.setText(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input_Podaj 8 ostatnich cyfr z numeru aktywowanej karty_parCardDigitsTmp'), "00000000")
	WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/input_Anuluj_btnActivateCard'))
} 
WebUI.click(findTestObject('Object Repository/pekaotr/PekaoTestKarty/Page_Pekao24  bankowo elektroniczna/span_Wyloguj'))


