package myTestPackage3;

import static org.junit.Assert.*;

import org.junit.Test;

import myTestPackage3.factorial;

public class testFactorial {

	@Test
	public void test() {
		factorial fa = new factorial();
		int result = fa.Factorial(4);
		assertEquals(24, result);  
	}

}
