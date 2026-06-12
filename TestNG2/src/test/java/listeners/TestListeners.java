package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListeners implements ITestListener {
	private static ExtentReports extent = ExtentManager.getReport();

	private ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Started : " + result.getParameters()[1].toString());

		test = extent.createTest(result.getParameters()[1].toString());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("PASS Listener Triggered");

		test.pass("Test Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("FAIL Listener Triggered");

		test.fail(result.getThrowable());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("SKIP Listener Triggered");

		test.skip("Test Skipped");

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();

		System.out.println("Extent Report Generated Successfully");
	}

}
