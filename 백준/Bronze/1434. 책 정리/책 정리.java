import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] box = new int[n];
        int[] book = new int[m];
        
        for(int i = 0; i < n; i++) {
            box[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < m; i++) {
            book[i] = scanner.nextInt();
        }
        
        int boxIndex = 0;

        for(int i = 0; i < m; i++) {
            while(box[boxIndex] < book[i]) {
                boxIndex++;
            }
            box[boxIndex] -= book[i];
        }
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += box[i];
        }
        
        System.out.println(result);
        scanner.close();
    }
}
