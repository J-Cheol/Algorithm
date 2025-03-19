class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int divisorCount = countDivisors(i);
            answer += (divisorCount % 2 == 0) ? i : -i;
        }
        return answer;
    }
    
    private int countDivisors(int num) {
        if (num == 1) {
          return 1;  
        } 
        
        int count = 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}