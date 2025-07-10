import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        int num = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
            if (arr[i].charAt(0) != 'F' && arr[i].charAt(0) != 'B') {
                num = Integer.parseInt(arr[i]) + 3 - i;
            }
        }

        if (num % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}