import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long answer = factorial(n);
        System.out.println(answer);
       
        sc.close();
    }
    private static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
}