class Solution {
    int[] memo;
    public int solution(int n) {
        memo = new int[n + 1];
        int answer = fibonacci(n);
        return answer % 1234567;
    }
    
    public int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        if(memo[n] != 0) {
            return memo[n];
        }
        
        return memo[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
    }
}