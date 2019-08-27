package generic_libraries;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	@Test
	public void test1()
	{
		ExtentReports reports= new ExtentReports("./report/r.html",false);
		
		ExtentTest tests = reports.startTest("TestScript 1");
		
		tests.log(LogStatus.PASS, "testcase is passed");
		tests.log(LogStatus.FAIL, "testcase is failed");
		tests.log(LogStatus.SKIP, "testcase is skipped");
		tests.log(LogStatus.ERROR, "error");
		tests.log(LogStatus.WARNING, "warning");
		
		reports.endTest(tests);
		
		reports.flush();
	}

}
