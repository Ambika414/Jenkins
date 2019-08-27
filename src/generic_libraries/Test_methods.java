package generic_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele =driver.findElement(By.id("month"));
		
		
		Generic_select gs= new Generic_select();
		
		gs.selectIndex(ele, 0);
		String text = ele.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		gs.selectVisibleText(ele, "Dec");
		String text1 = ele.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		gs.selectValue(ele, "1");
		String text2 = ele.getText();
		System.out.println(text2);
		
	

	}

}
