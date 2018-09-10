package maven_add;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddationTest {

	Addation add=new Addation();
	@Test
	public void add_test() {
		assertEquals(30, add.add(10, 20));
	}

}
