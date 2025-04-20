import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> numList = new ArrayList<>();
        for (int num : arr) {
            numList.add(num);
        }
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                for(int j = numList.size() - 1; j > query[i]; j--) {
                    numList.remove(j);
                }
            }
            else {
                for(int j = 0; j < query[i]; j++) {
                    numList.remove(0);
                }
            }
        }
        
        int[] answer = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}