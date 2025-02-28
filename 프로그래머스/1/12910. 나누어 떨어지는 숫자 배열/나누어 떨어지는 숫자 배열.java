import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> numList = new ArrayList<>();
        
        for(int num : arr) {
            if(num % divisor == 0) {
                numList.add(num);
            }
        }
        
        if(numList.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}