package RunnableJar;

import org.testng.TestNG;

public class Runner {

    static TestNG testng;

    public static void main(String[] arg) {
        //   ExtentReportListener ext = new ExtentReportListener();
        testng = new TestNG();
        testng.setTestClasses(new Class[]{TestRunner.class});
        // testng.addListener(ext);
        testng.run();
    }
}
