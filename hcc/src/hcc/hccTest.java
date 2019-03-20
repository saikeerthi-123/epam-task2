package hcc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class hccTest {

	@Test
	void test() {
		hccclass obj=new hccclass();
		 assertEquals(24000,obj.cost("standard",20),0.0);

		 assertEquals(30000,obj.cost("abovestandard",20),0.0);

		 assertEquals(36000,obj.cost("highstandard",20),0.0);

		 assertEquals(50000,obj.cost("highstandardandfullyautomated",20),0.0);	
	}

}
