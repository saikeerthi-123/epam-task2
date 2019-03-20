package epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class t2Test {
	
	t2 obj = new t2();
	@Test
	void t2Test() {
		t2 obj = new t2();
		assertEquals(5,obj.add(3,2));
		assertEquals(16,obj.multiply(8,2));
		assertEquals(3,obj.modulo(3,4));
		
	}

}
