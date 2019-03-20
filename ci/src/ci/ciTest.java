package ci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ciTest {

	@Test
	void test() {
		ciclass obj = new ciclass();
		assertEquals(5.000000000000001E-7, obj.calc(5000,0,5));

		assertEquals(5000, obj.calc(5000, 3, 0));

		assertEquals(2.336698218750001E-4, obj.calc(4449, 2.5, 5));
	}

}
