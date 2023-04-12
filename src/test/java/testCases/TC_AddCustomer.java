package testCases;

import org.testng.annotations.Test;

import loginPage.AddCustomer;
import loginPage.loginpage;

public class TC_AddCustomer extends BaseClass {
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		driver.get(baseurl);
		
		loginpage lp=new loginpage(driver);
	    lp.setUserName(username);
	    lp.setPassword(password);
	    lp.clickSubmit();
	
	    Thread.sleep(3000);
	    
	    
	    AddCustomer ac=new AddCustomer(driver);
	 
	    ac.clickAddNewCustomer();
	    Thread.sleep(3000);
	   
	    ac.customerName(customer);
	    Thread.sleep(3000);
	    ac.genderRadio();
	    Thread.sleep(3000);
	    ac.date(dd,mm,yy);
	    ac.adress(ad);
	    ac.city(ci);
	    ac.state(st);
	    ac.pin(pi);
	    ac.telephone(phone);
	    ac.email(mail);
	    ac.submit();
	    
	    //Validation
	 boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
	    if(result==true)
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");  
	    }
	     
	    
	}

}
