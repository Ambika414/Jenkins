package generic_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_libraries.Generic_JavaScriptExe;

public class Test_JSE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Like-new Smartphones')]"));
		Thread.sleep(3000);
		Generic_JavaScriptExe jse= new Generic_JavaScriptExe();
		jse.execute_script(driver,ele);

	}

}