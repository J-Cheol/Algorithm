import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int department : d) {
            if(budget > 0 && department <= budget) {
                budget -= department;
                answer++;
            }
            else
                break;
        }
            
        return answer;
    }
}