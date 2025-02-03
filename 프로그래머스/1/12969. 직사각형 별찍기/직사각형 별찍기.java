import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 0;
        while(i < b) {
            String answer = "";
            int j = 0;
            while(j < a) {
                answer += "*";
                j++;
                
            }
            i++;
            System.out.println(answer);
        }
        
    }
}