import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int appleIndex = score.length - 1;
        Arrays.sort(score);
        for(int end = score.length - 1; end + 1 >= m ; end -= m) {
            int min = 10;
            
            for(int count = m; count > 0 && appleIndex >= 0; count--) {
                min = Math.min(min, score[appleIndex]);
                
                appleIndex--;
            }
            answer += min * m;
        }
        
        return answer;
    }
}