import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        
        int average = sum / 5;
        int middle = numbers[2];
        System.out.println(average);
        System.out.println(middle);
        
        sc.close();
    }
}