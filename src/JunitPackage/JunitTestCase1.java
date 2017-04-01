package JunitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase1 {

	@Test
	public void test() {
		JunitTesting test2 = new JunitTesting();
		String output = test2.oddEven(5);
		assertEquals("Odd", output);
		}

}
