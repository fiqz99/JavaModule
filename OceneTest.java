import static org.junit.Assert.*;
import org.junit.Test;

public class OceneTest {
	@Test
	public void sixtyFiveReturnsD() {
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
	public void zeroReturnsF(){
		var ocena = new Ocene();
		assertEquals(ocena.determineGrade(0), 'F');
	}
	public void negativeReturnsException(){
		var ocena = new Ocene();
		assertThrows(IllegalArgumentException.class, 
				() -> {
					ocena.determineGrade(-1);
				});
	}
}
