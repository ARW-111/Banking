package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	WebDriver ldriver;
//Webelemt
	
	@FindBy(xpath="//a [contains(text(),'New Customer')]")
	private WebElement newcustomer;
	
	@FindBy(xpath="//input[@ type='text']")
	private WebElement customername;
	
	@FindBy(xpath="//input[@ type='radio']")
	private WebElement genderRadio;
	
	@FindBy(xpath="//input[@ type='date']")
	private WebElement date;
	
	@FindBy(xpath="//textarea[@ rows='5']")
	private WebElement adress;
	
	@FindBy(xpath="(//input[@ type='text']) [2]")
	private WebElement city;
	
	@FindBy(xpath="(//input[@ type='text']) [3]")
	private WebElement state;
	
	@FindBy(xpath="(//input[@ type='text']) [4]")
	private WebElement pin;
	
	@FindBy(xpath="(//input[@ type='text']) [5]")
	private WebElement telephone;
	
	@FindBy(xpath="(//input[@ type='text']) [6]")
	private WebElement email;
	
	@FindBy(xpath="//input[@ type='submit']")
	private WebElement submit;
     
	//to intialze webelemnt(constructor)
	
	public AddCustomer (WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//action weebelemnt
	public void clickAddNewCustomer()
	{
		newcustomer.click();
	}
	
	public void customerName(String customer)
	{
		customername.sendKeys(customer);
	}
	
	public void genderRadio()
	{
		genderRadio.click();
	}
	
	public void date(String dd,String mm,String yy)
	{
		date.sendKeys(dd);
		date.sendKeys(mm);
		date.sendKeys(yy);
	}
	
	public void adress(String ad)
	{
		adress.sendKeys(ad);
	}
	
	public void city(String ci)
	{
		city.sendKeys(ci);
	}
	
	public void state(String st)
	{
		state.sendKeys(st);
	}
	
	public void pin(String pi)
	{
		pin.sendKeys(pi);
	}
	
	public void telephone(String phone)
	{
		telephone.sendKeys(phone);
	}
	
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void submit()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
}
