package Runner;

import org.testng.TestNG;

import java.util.Collections;
import java.util.List;

public class TESTNGRunner {
	public static void main(String[] args) {

		TestNG testng = new TestNG();

        // testng.xml must be in same folder as jar
        testng.setTestSuites(
                List.of("testng.xml")
        );
        testng.run();
    }
}
