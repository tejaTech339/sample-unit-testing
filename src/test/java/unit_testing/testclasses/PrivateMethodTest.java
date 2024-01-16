package unit_testing.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import unit_testing.target.PrivateMethod;

public class PrivateMethodTest {

	@Test
	public void testSum() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		PrivateMethod pm=new PrivateMethod();
	   
		Method declaredMethod = pm.getClass().getDeclaredMethod("sum", Integer.class,Integer.class);
		
		declaredMethod.setAccessible(true);
		
		Integer actualSum =(Integer) declaredMethod.invoke(pm, 10,20);
		Integer expSum=30;
		assertEquals(expSum, actualSum);
	}
}
