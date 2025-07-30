import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}