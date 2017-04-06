package JunitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase {

	@Test
	public void test() {
		JunitTesting test1 = new JunitTesting();
		int output = test1.square(6);
		assertEquals(25, output);
	}

}
