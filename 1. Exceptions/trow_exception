import java.util.Scanner;

public class DemoExeptions {

	public static void main(String[] args) {
		
		int a = 8, b = 10, c = 0;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number: ");
			int n = scanner.nextInt();
			c = a + n;
			if (c>10) {
				throw new ArithmeticException();
			}
			System.out.println("Sum is: "+ c);
		}catch(ArithmeticException e) {
			System.out.println("Maximum value is 2");
		}catch(Exception e) {
			System.out.println("Some other exception: " + e);
		}
		
	}
	
}
