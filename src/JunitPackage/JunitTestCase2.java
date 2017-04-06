package JunitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase2 {

	@Test
	public void test() {
		JunitTesting test3 = new JunitTesting();
		String output = test3.reverse("chandand");
		assertEquals("nadnahc", output);
	}

}
