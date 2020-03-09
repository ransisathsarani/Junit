package myTestPackage2;

import static org.junit.Assert.*;

import org.junit.Test;

import myTestPackage2.circleArea;

public class testCircleArea {

	@Test
	public void test() {
		circleArea ca = new circleArea();
		int result = ca.CircleArea(7);
		assertEquals(147, result);
	}

}
