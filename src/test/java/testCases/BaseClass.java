package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseurl="https://demo.guru99.com/V1/index.php";
	public String username="mngr487034";
	public String password="asusyjU";
	public String customer="ARW";
	public String dd="9";
	public String mm="4";
	public String yy="1997";
	public String ad="Ekvira Nagar";
	public String ci="Yavataml";
	public String st="Maharastra";
	public String pi="445001";
	public String phone="123456789";
	public String mail="abhiwadgule@gmail.com";

	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ST software\\DriverS Key\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	
	
	
	

}
