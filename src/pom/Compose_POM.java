package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose_POM extends Base_Page {
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement com;
	
	@FindBy(xpath="//textarea[@name='to' and @aria-label='To']")
	private WebElement to;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement sub;
	
	@FindBy(xpath="(//div[.='Send'])[3]")
	private WebElement sen;
	
	@FindBy(xpath="(//span[@class='bA4'])[1]")
	private WebElement clk;
	
	
	public Compose_POM(WebDriver driver)
	{
		super(driver);
	}
	
	public void Compose()
	{
		com.click();
	}
	
	public void Mail_id(String e)
	{
		to.sendKeys(e);
	}
	
	public void Subject(String s)
	{
		sub.sendKeys(s);
	}
	
	public void Send()
	{
		sen.click();
	}
	
	public void clickMail()
	{
	clk.click();
	}
}
