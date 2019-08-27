package generic_libraries;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_select {
	
	public void selectIndex(WebElement driver, int value)
	{
		Select s = new Select(driver);
		s.selectByIndex(value);
		
	}
	
	public void selectValue(WebElement driver,String str)
	{
		Select s = new Select(driver);
		s.selectByValue(str);
		
		
	}
	public void selectVisibleText(WebElement driver,String str1)
	{
		Select s = new Select(driver);
		s.selectByVisibleText(str1);	
	}
	
	public void deselect(WebElement driver)
	{
		Select s = new Select(driver);
		s.deselectAll();
	}
	
	public void deselectIndex(WebElement driver, int value1)
	{
		Select s = new Select(driver);
		s.deselectByIndex(value1);
	}
	
	public void deselectValue(WebElement driver,String str2)
	{
		Select s = new Select(driver);
		s.deselectByValue(str2);
	}
	
	public void deselectVisibleText(WebElement driver,String str3)
	{
		Select s = new Select(driver);
		s.deselectByVisibleText(str3);
	}
	
	public void getAllselected(WebElement driver)
	{
		Select s = new Select(driver);
		s.getAllSelectedOptions();
	}
	
	public int count_options(WebElement driver)
	{
		Select s = new Select(driver);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		return count;
	}
	
	public void getFirstOption(WebElement driver)
	{
		Select s = new Select(driver);
		s.getFirstSelectedOption();
	}


}
