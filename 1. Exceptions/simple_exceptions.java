
public class DemoExeptions {

	public static void main(String[] args) {
		
		//Simple zeroDivision exception
		int a, j, k = 0;
		a = 8;
		j=0;
		try {
			k = a/j;
		}
		catch(Exception e){
			System.out.println(e + "\n Cannot divide by zero");
		}
		System.out.println(k);
		
		//More exceptions in one try block
		int ar[] = new int[5];
		try {
			
			
			for (int i = 0; i<=5; i++) {
				ar[i] = i+1;
			}
			for(int value : ar) {
				System.out.println(value);
			} 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Bye");
		}
		
	}
	
}
