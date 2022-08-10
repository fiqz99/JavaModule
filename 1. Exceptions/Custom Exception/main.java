import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println ("Enter your JMBG!");
		try {
			Scanner scanner = new Scanner(System.in);
			String jmbg = scanner.nextLine();
			if (jmbg.length() == 13) {
				System.out.println("Thanks!");
			}else {
				throw new WrongCharacterNumException("Morate uneti tacno 13 karaktera");
			}
			scanner.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
