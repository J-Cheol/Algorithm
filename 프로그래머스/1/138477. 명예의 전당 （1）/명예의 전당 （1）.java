import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Integer[] hallOfFame = new Integer[k];
        
        int min = 2001;
        int i = 0;
        int j = k;
        for(int scores : score) {
            if(j > 0) {
                hallOfFame[i] = scores;
                min = Math.min(hallOfFame[i], min);
                answer[i] = min;
                j--;
                i++;
                if(j == 0)
                    Arrays.sort(hallOfFame, Collections.reverseOrder());
            }
            else if(scores >= hallOfFame[k - 1]) {
                hallOfFame[k - 1] = scores;
                Arrays.sort(hallOfFame, Collections.reverseOrder());
                answer[i++] = hallOfFame[k - 1];
            }
            else
                answer[i++] = hallOfFame[k - 1];
        }
        return answer;
    }
        
}
