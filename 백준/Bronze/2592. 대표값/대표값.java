import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int sum = 0;
        
        for(int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        
        int average = sum / 10;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int mode = frequencyMap.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();
        
        System.out.println(average);
        System.out.println(mode);
        
        sc.close();
    }
}