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

WebUI.navigateToUrl('http://www.hancomdocs.com/')

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/MainCopy'), '이제 한컴오피스 구독으로')

WebUI.scrollToElement(findTestObject('Object Repository/HD_Landing/button_Planmove_landing'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/Plancard_personal_title_landing'), '개인용')

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_personal_m'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/')

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_personal_y'))

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/certifiction_personl_y'), '개인용 연간 이용')

WebUI.navigateToUrl('http://www.hancomdocs.com/home')

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/button_Logout'))

WebUI.scrollToElement(findTestObject('Object Repository/HD_Landing/button_Planmove_landing'), 0)

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_biz_m'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/')

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_biz_y'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/')

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Cupon'))

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Title_Setting'), '설정')

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/button_Logout'))

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Planmove_landing'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/Plan_TitleResouce'), '나에게 맞는 요금제로 합리적인 서비스를 경험하세요.')

WebUI.click(findTestObject('Object Repository/HD_Landing/BI_Docs'))

WebUI.click(findTestObject('Object Repository/HD_Landing/button_subscribe_landig'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/Plan_TitleResouce'), '나에게 맞는 요금제로 합리적인 서비스를 경험하세요.')

WebUI.click(findTestObject('Object Repository/HD_Landing/BI_Docs'))

WebUI.click(findTestObject('Object Repository/HD_Landing/button_plan_appbar'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/Plan_TitleResouce'), '나에게 맞는 요금제로 합리적인 서비스를 경험하세요.')

WebUI.click(findTestObject('Object Repository/HD_Landing/BI_Docs'))

WebUI.click(findTestObject('Object Repository/HD_Landing/button_subscribe_appbar'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/plancompare_title'), '요금제 비교')

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_personal_m_plan'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/plans')

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_personal_y_plan'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/plans')

WebUI.click(findTestObject('HD_Landing/plancard_subscribe_biz_m_plan'))

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/certifiction_biz_m'), '기업용 월간 이용')

WebUI.navigateToUrl('http://www.hancomdocs.com/home')

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/button_Logout'))

WebUI.click(findTestObject('Object Repository/HD_Landing/button_plan_appbar'))

WebUI.click(findTestObject('Object Repository/HD_Landing/plancard_subscribe_biz_y_plan'))

WebUI.verifyElementText(findTestObject('Object Repository/HD_Landing/button_Login'), '로그인')

WebUI.navigateToUrl('http://www.hancomdocs.com/')

