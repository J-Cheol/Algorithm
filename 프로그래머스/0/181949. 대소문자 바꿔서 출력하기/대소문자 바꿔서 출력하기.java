import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(char c : a.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                c -= 32;
            }
            else if(c >= 'A' && c <= 'Z') {
                c += 32;
            }
            answer += c;
        }
        System.out.print(answer);
    }
}