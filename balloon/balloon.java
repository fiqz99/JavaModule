import java.util.Scanner;

public class Solution {

    public static int solution(String s){
        //B A L L O O N
        int length = s.length();
        int bCounter =0;
        int aCounter =0;
        int lCounter =0;
        int oCounter =0;
        int nCounter =0;
        for (int i =0; i<length; i++){
            if (s.charAt(i) == 'B'){
                bCounter++;
            }
            else if (s.charAt(i) == 'A'){
                aCounter++;
            }
            else if (s.charAt(i) == 'L'){
                lCounter++;
            }
            else if (s.charAt(i) == 'O'){
                oCounter++;
            }
            else if (s.charAt(i) == 'N'){
                nCounter++;
            }
            else {
                continue;
            }
        }
        return Math.min(Math.min(bCounter,aCounter),Math.min(nCounter, Math.min(lCounter/2, oCounter/2)));
    }

    public static void main(String[] args) {
        System.out.println("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String str = scanner.nextLine();
            str = str.toUpperCase();
            int num = solution(str);
            System.out.println("Number of word Ballon in given word: " + String.valueOf(num));
        }catch(Exception e){
            System.out.println("Enter string only!");
        }finally {
            scanner.close();
        }
    }
}
