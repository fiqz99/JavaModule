import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=1, c=0;
		try {
			System.out.println("Enter a number: ");
			int n = scanner.nextInt();
			c = a/n;
			System.out.println(c);
			
		}catch(ArithmeticException | InputMismatchException e) {
			System.out.println(e);
		}finally {
			scanner.close();
		}
	}
}
