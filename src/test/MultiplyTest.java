package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void multiplytest() {
		Junit test=new Junit();
		int result=test.multiply(4, 4);
		assertEquals(16,result);
		
	}

}
