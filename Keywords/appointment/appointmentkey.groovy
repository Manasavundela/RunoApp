package appointment

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class appointmentkey {

	@Keyword

	public void NewCustomerAppointment(){
		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.FrameLayout12'), 0)

		Mobile.setText(findTestObject('NEW CUS APPOINTMENT/android.widget.EditText0 (1)'), '7777777777', 0)

		Mobile.setText(findTestObject('NEW CUS APPOINTMENT/android.widget.EditText1 (1)'), 'Auto', 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.Spinner0 (1)'), 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.TextView2 - Male (1)'), 0)

		Mobile.setText(findTestObject('NEW CUS APPOINTMENT/android.widget.EditText2 (1)'), 'auto@auto.com', 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.view.ViewGroup3 (1)'), 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.view.View30 - 30'), 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.Button1 - OK (2)'), 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.ImageButton0 (1)'), 0)

		Mobile.setText(findTestObject('NEW CUS APPOINTMENT/android.widget.EditText0 - 17'), '23', 0)

		Mobile.setText(findTestObject('NEW CUS APPOINTMENT/android.widget.EditText1 - 19'), '58', 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.Button1 - OK (3)'), 0)

		Mobile.tap(findTestObject('NEW CUS APPOINTMENT/android.widget.Button0 - SUBMIT (1)'), 0)

		Mobile.closeApplication()
	}
}
