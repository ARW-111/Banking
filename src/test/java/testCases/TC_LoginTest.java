package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import loginPage.loginpage;




public class TC_LoginTest extends BaseClass {
	@Test
	public void loginTest()
	{
		driver.get(baseurl);
		
		loginpage lp=new loginpage(driver);
	    lp.setUserName(username);
	    lp.setPassword(password);
	    lp.clickSubmit();
	
	//validation
	if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
		
		
	}

}
