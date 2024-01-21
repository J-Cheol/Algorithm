import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        
        while(i < n)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            i++;
        }
    }
}