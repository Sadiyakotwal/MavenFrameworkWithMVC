package Flows;

import com.PageFactory.BootstrapAlertPage;
import com.PageFactory.CheckBoxDemoPage;
import com.PageFactory.SeleniumEasyDemoHomePage;

import com.PageFactory.SimpleFormDemoPage;
import com.Scripts.SimpleFormTest;
import com.generic.BaseTest;

public class SeleniumEasyFlow
{
	private BaseTest objBaseTest;
	public String strTestData;
	private SeleniumEasyDemoHomePage objSeleniumEasyDemoHomePage;
	private SimpleFormDemoPage objSimpleFormDemoPage;
	private BootstrapAlertPage objBootstrapAlertPage;
	private CheckBoxDemoPage objCheckBoxDemoPage;


	/**
	 * Description: To create object of all page classes
	 * @param baseTest
	 */
	public SeleniumEasyFlow(BaseTest baseTest) 
	{
		this.objBaseTest = baseTest;
		objSeleniumEasyDemoHomePage = new SeleniumEasyDemoHomePage(objBaseTest);
		objSimpleFormDemoPage = new SimpleFormDemoPage(objBaseTest);
		objBootstrapAlertPage = new BootstrapAlertPage(objBaseTest);
		objCheckBoxDemoPage = new CheckBoxDemoPage(objBaseTest);
	}
	
	public void closePopUp() 
	{
		objSeleniumEasyDemoHomePage.managePopUp();
	}
	public void verifySeleniumEasyHomePageIsDisplayed() 
	{
		objSeleniumEasyDemoHomePage.verifySeleniumEasyHomePageIsDisplayed();
	}
	/**
	 *Description:Click on Input forms menubar and Simple Input Form dropdown option
	 */
	public void clickOnInputFormMenuBarOption() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strMenuBar");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectMenuBarElement(strTestData);
		}
	}
	public void selectSimpleFormDropDownFromMenuBar() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strDropDownValue");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectParticularDropDown(strTestData);
		}
	}
	
	public void verifyHeaderOfSimpleFormDemoPage() 
	{
		objSimpleFormDemoPage.verifySimpleFormDemoPageIsDisplayed();
	}
	
	public void verifySingleInputFieldHeader() 
	{
		objSimpleFormDemoPage.verifySingleInputFieldHeader();	
	}
	public void setSingleInputFieldMessage() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strMessage");
		if (!strTestData.equals("")) 
		{
			objSimpleFormDemoPage.setSingleInputFieldMessage(strTestData);
		}	
	}
	public void clickShowMessageButton() 
	{
		objSimpleFormDemoPage.clickShowMessageButton();
	}
	public void verifySingleInputFieldMessage() 
	{
		objSimpleFormDemoPage.verifyMessageEnteredInSingleInputField();	
	}
	
	/**
	 * Description:Click on alerts and modals menu option and bootstrap alert dropdown
	 */
	public void clickOnAlertsAndModalsAndSelectDropDrown() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strMenuBarAlerts");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectMenuBarElement(strTestData);
		}
		strTestData = objBaseTest.objConfigProperties.getProperty("strDropDownValueBootstrapAlerts");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectParticularDropDown(strTestData);
		}	
	}
	public void verifyBootstrapAlertPageIsDisplayed() 
	{
		objBootstrapAlertPage.verifyBootstrapAlertPageIsDisplayed();
	}
	/**
	 * Description: Button 1
	 * Autocloseable Success Message Button
	 */
	public void verifyAutocloseableSuccessMsgButtonIsDisplayed() 
	{
		objBootstrapAlertPage.verifyAutocloseableSuccessMsgButtonIsDisplayed();	
	}
	public void clickAutocloseableSucessMessageButton() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strAutocloseableSuccessButton");
		if (!strTestData.equals("")) 
		{
			objBootstrapAlertPage.clickBootstrapAlertButtonsOption(strTestData);
		}
	}
	public void verifyAutocloseableSuccessMessageIsDisplayed() 
	{
		objBootstrapAlertPage.verifyAutocloseableSuccessMsgButtonIsDisplayed();	
	}
	/**
	 * Description:Button 2
	 * Normal Success Message Button
	 */
	public void clickNormalSuccessMessageButton() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strNormalSuccessButton");
		if (!strTestData.equals("")) 
		{
			objBootstrapAlertPage.clickBootstrapAlertButtonsOption(strTestData);
		}
	}
	public void verifyNormalSuccessMessageIsDisplayed() 
	{
		objBootstrapAlertPage.verifyNormalSuccessMessageIsDisplayed();
		
	}
	/**
	 * Description:Button 3
	 * Autocloseable Warning Message Button
	 */
	public void clickAutocloseableWarningMessageButton() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strAutocloseableWarningButton");
		if (!strTestData.equals("")) 
		{
			objBootstrapAlertPage.clickBootstrapAlertButtonsOption(strTestData);
		}
	}
	public void verifyAutocloseableWarningMessageIsDisplayed() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strExpAutocloseableWarningMsg");
		if (!strTestData.equals("")) 
		{
			objBootstrapAlertPage.verifyAutocloseableWarningMessageIsDisplayedOrNot(strTestData);
		}
	}
	/**
	 * Description: Click on Input Forms menubar option and select checkboxdemo dropdown
	 */
	public void clickOnInputFormMenuOptionAndSelectCheckBoxDemoDropDown() 
	{
		strTestData = objBaseTest.objConfigProperties.getProperty("strMenuBar");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectMenuBarElement(strTestData);
		}
		strTestData = objBaseTest.objConfigProperties.getProperty("strDropDownValueCheckBox");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectParticularDropDown(strTestData);
		}
	}
	public void verifyCheckBoxDemoPageIsDisplayed() 
	{
		objCheckBoxDemoPage.verifyCheckBoxDemoPageIsDisplayedOrNot();	
	}
	public void verifySingleCheckBoxDemoHeaderIsDisplayed() 
	{
		objCheckBoxDemoPage.verifySingleCheckBoxDemoSectionHeaderIsDisplayedOrNot();
	}
	public void selectSingleCheckBox() 
	{
		objCheckBoxDemoPage.selectSingleCheckBox();
	}
	
}

/*
 * 
 * 
 public void clickOnMenuBar(String strMenuBarOption)
  {
		if (strMenuBarOption.equals("Input Forms")) 
		{
			if (!strTestData.equals("")) 
			{
		objSeleniumEasyDemoHomePage.selectMenuBarElement(strTestData);
	      }
		}
	
	strTestData = objBaseTest.objConfigProperties.getProperty("strDropDownValue");
		if (!strTestData.equals("")) 
		{
			objSeleniumEasyDemoHomePage.selectParticularDropDown(strTestData);
		}
	
} else {
*/
