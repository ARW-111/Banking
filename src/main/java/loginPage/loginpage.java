package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//Webelemnt
	
	@FindBy(name="uid")
	private WebElement txtusername;
	@FindBy(name="password")
	private WebElement txtpassword;
	@FindBy(name="btnLogin")
	private WebElement btnlogin;
	WebDriver ldriver;
	
	//to initalize webelement
	public loginpage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	
	//action on webelement
	public void setUserName(String username)
	{
		txtusername.sendKeys(username);
	}
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	public void clickSubmit() 
	{
		btnlogin.click();
	}
	
	

}
