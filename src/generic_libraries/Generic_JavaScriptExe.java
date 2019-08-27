package generic_libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_JavaScriptExe {
	public void execute_asyn_script(WebElement driver,String str, Object obj)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeAsyncScript(str, obj);
	}
	
	public void execute_script(WebDriver driver, WebElement ele1)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Point loc = ele1.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
		
		int y = loc.getY();
		System.out.println(y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
