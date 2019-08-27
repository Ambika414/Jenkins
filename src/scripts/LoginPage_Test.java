package scripts;


import generic_libraries.Generic_Test;
import generic_libraries.Property_File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Compose_POM;
import pom.LoginPage_Pwd_POM;
import pom.LoginPage_UN_POM;



public class LoginPage_Test extends Generic_Test {
	@Test
	public void testLogin() throws InterruptedException, FileNotFoundException, IOException
	{

		LoginPage_UN_POM lp= new LoginPage_UN_POM(driver);
		
		lp.setUsername("ambika.n.bashetty@gmail.com");
		Thread.sleep(3000);
		lp.clickNext();
		Thread.sleep(3000);
		LoginPage_Pwd_POM lp1=new LoginPage_Pwd_POM(driver);
		
		lp1.setPwd("ambu@414");
		Thread.sleep(3000);
		lp1.clickNext();
		Thread.sleep(3000);
		
		Compose_POM c= new Compose_POM(driver);
		c.Compose();
		Thread.sleep(5000);
		c.Mail_id("ambika.n.bashetty@gmail.com");
		Thread.sleep(3000);
		c.Subject("HIIIIhello");
		Thread.sleep(3000);
		c.Send();
	}
}
