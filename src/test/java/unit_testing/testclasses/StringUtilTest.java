package unit_testing.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import unit_testing.target.StringUtil;

public class StringUtilTest {

	@Test
	public void stingToIntTest1() {
		
		StringUtil str=new StringUtil();
		assertThrows(IllegalArgumentException.class, ()->str.stringToInt(null));
	}
	@Test
	public void stingToIntTest2(){
		
		StringUtil str=new StringUtil();
		assertThrows(IllegalArgumentException.class, ()->str.stringToInt(""));
	}
	@Test
	public void stingToIntTest3() {
		
		StringUtil str=new StringUtil();
		Integer intValue = str.stringToInt("9");
		assertEquals(9, intValue);
	}


}
