package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Generic_Alert_popup {
	public void acc(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		
		String txt = a.getText();
		System.out.println(txt);
		a.accept();
	}
	
	public void diss(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		
		String txt = a.getText();
		System.out.println(txt);
		a.dismiss();
	}
	public void fileDownload(WebDriver driver, int key) throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(key);
		r.keyRelease(key);
	}
	
	public void childBrowser(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	
	public Set<String> childBrowser1(WebDriver driver)
	{
		Set<String> p = driver.getWindowHandles();
		return p;
	}

}
