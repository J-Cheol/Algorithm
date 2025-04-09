import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            int size = stk.size();
            if(size == 0) {
                stk.add(arr[i]);
            }
            else if(stk.get(size - 1) == arr[i]) {
                stk.remove(size - 1);
            }
            else if(stk.get(size - 1) != arr[i]) {
                stk.add(arr[i]);
            }
            i++;
        }
        if(stk.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[stk.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}