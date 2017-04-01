package JunitPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitTestCase.class, JunitTestCase1.class, JunitTestCase2.class })
public class TestSuite {

}
