class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        if(x < 10)
            return answer;
        
        int sum = sumOfDigits(x);
        
        if(x % sum == 0)
            return answer;
        else {
            answer = false;
            return answer;
        }
    }
    
    public int sumOfDigits(int x) {
        
        if(x < 10)
            return x;
        else {
            return x % 10 + sumOfDigits(x / 10);
        }
    }
}