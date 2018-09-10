package maven_sub;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTest {

	Subtraction sub=new Subtraction();
	@Test
	public void add_test() {
		assertEquals(30, sub.add(50, 20));
	}

}
