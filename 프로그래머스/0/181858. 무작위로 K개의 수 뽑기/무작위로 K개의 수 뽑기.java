import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        int[] answer = new int[k];
        
        List<Integer> numList = new ArrayList<>();
        for(int num : arr) {
            if(!numList.contains(num) && numList.size() < k) {
                numList.add(num);
            }
        }
        int i = 0;
        for(int num : numList) {
            answer[i++] = num;
        }
        while(i < k) {
            answer[i++] = -1;
        }
        return answer;
    }
}