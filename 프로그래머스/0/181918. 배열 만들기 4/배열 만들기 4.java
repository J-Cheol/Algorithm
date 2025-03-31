import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        
        for(int num : arr) {
            while(!numList.isEmpty() && numList.get(numList.size() - 1) >= num) {
                numList.remove(numList.size() - 1);
            }
            numList.add(num);
        }
        
        int[] stk = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++) {
            stk[i] = numList.get(i);
        }
        
        return stk;
    }
}