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

Mobile.startApplication('C:\\RUNO\\Automation\\Apk\\runo_1.1.12_qa.apk', true)

Mobile.tap(findTestObject('OPERATOR LOGIN/android.widget.TextView2 - Next'), 0)

Mobile.tap(findTestObject('OPERATOR LOGIN/android.widget.TextView2 - Get Started'), 0)

Mobile.setText(findTestObject('OPERATOR LOGIN/android.widget.EditText0'), '9492271088', 0)

Mobile.tap(findTestObject('OPERATOR LOGIN/android.widget.Button0 - SEND OTP'), 6)

