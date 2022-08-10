package unitTest;
import static org.junit.Assert.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OceneTest {
	@BeforeClass
	public static void beforeLog() {
		Logger logger = Logger.getLogger(OceneTest.class.getName());
		logger.log(Level.INFO, "Log before class.");
	}
	@Test
	public void sixtyFiveReturnsD() {
		System.out.println("First test");
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(65), 'D');
	}
	@Test
	public void fiftyFiveReturnsE() {
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(55), 'E');
	}
	@Test
	public void fiveReturnsf() {
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(5), 'F');
	}
	@Test
	public void eightyThreeReturnsB() {
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(83), 'B');
	}
	@Test
	public void seventyFiveReturnsC(){
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(75), 'C');
	}
	@Test
	public void ninetyTwoReturnsA(){
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(92), 'A');
	}
	@Test
	public void overHundredReturnsSlash(){
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(120), '/');
	}
	@Test
	public void negativeReturnsException(){
		System.out.println("Last test");
		var ocena = new Ocene();
		assertThrows(IllegalArgumentException.class, 
				() -> {
					ocena.determineGrade(-1);
				});
	}
	@AfterClass
	public static void afterLog() {
		Logger logger = Logger.getLogger(OceneTest.class.getName());
		logger.log(Level.INFO, "Log after class.");
	}
}
