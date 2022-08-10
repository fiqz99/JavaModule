import java.util.Scanner;
import java.io.*;

public class main {

	public static void main(String[] args) {
		try {
			FileInputStream GFG = new FileInputStream("Desktop/Pitanja.txt");
			System.out.println("Ok.");
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exist");
		}
	}
}
