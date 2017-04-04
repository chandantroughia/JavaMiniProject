package MockitoPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import static org.mockito.Mockito.*;

public class TestCase {
	InterfaceCallingClass calling;
	@Before
	public void start(){
		InterfaceToBeTested ITBT = mock(InterfaceToBeTested.class);
		when(ITBT.square(10)).thenReturn(100);
		calling = new InterfaceCallingClass();
		calling.setSample(ITBT); // mock object for calling, so that when I call calling
								// it internally calls 'square' method that we are specifying
								// in when() call
	}
	@SuppressWarnings("deprecation")
	@Test
	public void TestSquareOfANumber(){
		Assert.assertEquals(100, calling.squareOfANumber(10));
	}
}
