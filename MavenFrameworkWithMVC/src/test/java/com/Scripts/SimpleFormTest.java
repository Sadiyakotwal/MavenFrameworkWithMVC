package com.Scripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.PageFactory.BootstrapAlertPage;
import com.PageFactory.CheckBoxDemoPage;
import com.PageFactory.SeleniumEasyDemoHomePage;
import com.PageFactory.SimpleFormDemoPage;
import com.generic.BaseTest;
import Flows.SeleniumEasyFlow;

public class SimpleFormTest extends BaseTest
{
	/**
	 * Description: Creating global references
	 */
	private SeleniumEasyFlow objSeleniumEasyFlow;
	/**
	 *Description:Creating object through reference 
	 */
	public void initializePageObjectModel() 
	{
		objSeleniumEasyFlow = new SeleniumEasyFlow(this);
	}
	/**
	 *Description: To call the method of basetest class of initializing the
	 *WebEnvironment.
	 */
	@BeforeClass
	public void initializeWebEnvironmentAndSetup()
	{
		this.initializePageObjectModel();
		initializeWebEnvironment();
		objSeleniumEasyFlow.closePopUp();
		
	}
	
	@Test(priority=1,groups = "SmokeTest")
	public void TC_ID_100_verifySeleniumEasHomePageIsDisplayed() 
	{
		objSeleniumEasyFlow.verifySeleniumEasyHomePageIsDisplayed();
		objSeleniumEasyFlow.clickOnInputFormMenuBarOption();
		objSeleniumEasyFlow.selectSimpleFormDropDownFromMenuBar();
	}

	@Test(priority=2,groups = "RegressionTest")
	public void TC_ID_101_verifySingleInputFieldMessage() 
	{
		objSeleniumEasyFlow.verifyHeaderOfSimpleFormDemoPage();
		objSeleniumEasyFlow.verifySingleInputFieldHeader();
		objSeleniumEasyFlow.setSingleInputFieldMessage();
		objSeleniumEasyFlow.clickShowMessageButton();
		objSeleniumEasyFlow.verifySingleInputFieldMessage();
	}
	

	@Test(priority=3)
	public void TC_ID_102_VerifyBootstrapAlertPageIsDisplayed() 
	{
		objSeleniumEasyFlow.clickOnAlertsAndModalsAndSelectDropDrown();
		objSeleniumEasyFlow.verifyBootstrapAlertPageIsDisplayed();
	}
	@Test(priority=4)
	public void TC_ID_104_verifyAutocloseableSuccessMessage() 
	{
		objSeleniumEasyFlow.verifyAutocloseableSuccessMsgButtonIsDisplayed();
		objSeleniumEasyFlow.clickAutocloseableSucessMessageButton();
		objSeleniumEasyFlow.verifyAutocloseableSuccessMessageIsDisplayed();
	}
	@Test(priority=5)
	public void TC_ID_105_verifyNormalSuccessMessageIsDisplayed() 
	{
		objSeleniumEasyFlow.clickNormalSuccessMessageButton();
		objSeleniumEasyFlow.verifyNormalSuccessMessageIsDisplayed();
	}
	@Test(priority=6)
	public void TC_ID_106_verifyAutocloseableWarningMessageIsDisplayed() 
	{
		objSeleniumEasyFlow.clickAutocloseableWarningMessageButton();
		objSeleniumEasyFlow.verifyAutocloseableWarningMessageIsDisplayed();
	}
	@Test(priority=7)
	public void TC_ID_106_verifyCheckDemoPageIsDisplayed() 
	{
		objSeleniumEasyFlow.clickOnInputFormMenuOptionAndSelectCheckBoxDemoDropDown();
		objSeleniumEasyFlow.verifyCheckBoxDemoPageIsDisplayed();
	}
	@Test(priority=8)
	public void TC_ID_108_verifySingleCheckBoxDemoIsSelected() 
	{
		objSeleniumEasyFlow.verifySingleCheckBoxDemoHeaderIsDisplayed();
		objSeleniumEasyFlow.selectSingleCheckBox();
	}
	
	/**
	 *Description: To close the web environment 
	 */
	@AfterClass
	public void tearDownWebEnvironment()
	{
		tearDown();
	}
}
