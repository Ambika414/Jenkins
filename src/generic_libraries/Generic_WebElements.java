package generic_libraries;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_WebElements {
	public void senddata(WebElement ele,String data)
	{
		ele.sendKeys(data);
	}
	
	public void location(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
		
		int y = loc.getY();
		System.out.println(y);
	}
	
	public String tooltip(WebElement ele,String value)
	{
		String tooltip=ele.getAttribute(value);
		System.out.println(tooltip);
		return tooltip;
	}

}
