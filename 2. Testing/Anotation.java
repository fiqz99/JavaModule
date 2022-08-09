import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {
	@Before
	public void beforeClass() {
		System.out.println("Running...beforeClass");
	}
	
	@Test
	public void junitTest1() {
		String actualValue = "Hello World";
		System.out.println("Inside the test");
		assertEquals("Hello World", actualValue);
	}
	
	@After
	public void afterClass() {
		System.out.println("Running...afterClass");
	}
}
