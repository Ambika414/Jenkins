package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_UN_POM extends Base_Page {
	@FindBy(id="identifierId")
	private WebElement un1;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	public LoginPage_UN_POM(WebDriver driver)
	{
		super(driver);
	}
	
	public void setUsername(String un )
	{
		un1.sendKeys(un);
	}
	
	public void clickNext()
	{
		next.click();
	}
	

}
