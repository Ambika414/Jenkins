package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Pwd_POM extends Base_Page {
	@FindBy(name="password")
	private WebElement un1;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	public LoginPage_Pwd_POM(WebDriver driver)
	{
		super(driver);
	}
	
	public void setPwd(String pd)
	{
		un1.sendKeys(pd);
	}
	
	public void clickNext()
	{
		next.click();
	}
	

}
