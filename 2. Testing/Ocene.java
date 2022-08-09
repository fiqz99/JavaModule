public class Ocene {
	public char determineGrade(int numPoints) {
		if (numPoints<0) {
			throw new IllegalArgumentException("Broj poena ne moze biti negativan!");
		}
		else if (numPoints<=50) {
			return 'F';
		}
		else if (numPoints<=60) {
			return 'E';
		}
		else if (numPoints<=70) {
			return 'D';
		}
		else if (numPoints<=80) {
			return 'C';
		}
		else if (numPoints<=90) {
			return 'B';
		}
		else if (numPoints<=100) {
			return 'A';
		}
		else {
			return '/';
		}
	}
}
