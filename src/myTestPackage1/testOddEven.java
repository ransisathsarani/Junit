package myTestPackage1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testOddEven {

	@Test
	public void test() {
		
		oddEven oe = new oddEven();
		String result = oe.OddEven(10);
		assertEquals("Even", result);
	}

}
