import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        List<Integer> removeArr = new ArrayList<>();
        int min = arr[0];
        if(arr.length > 1) {
            for(int num : arr) {
                removeArr.add(num);
                min = Math.min(num, min);
            }
            removeArr.remove(Integer.valueOf(min));
        }
        else
            return new int[]{-1};
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = removeArr.get(i);
        }
        return answer;
    }
}