class Solution {
    public int solution(int n) {
        if(n % 2 != 0) {
            return sumOfOddNumbers(n);
        }
        else {
            return sumOfEvenSquares(n);
        }
        
    }
        
    public int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        } 
        return sum;
    }
    
    public int sumOfEvenSquares(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i * i;
        }
        return sum;
    }
}