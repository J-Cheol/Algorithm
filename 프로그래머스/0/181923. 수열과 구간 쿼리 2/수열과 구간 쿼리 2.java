import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> numList = new ArrayList<>();
        
        for(int j = 0; j < queries.length; j++) {
            int min = 2147483647;
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            for(int i = s; i <= e; i++) {
                if(arr[i] > k) {
                    min = Math.min(arr[i], min);
                }
                if(i == e && min != 2147483647) {
                    numList.add(min);
                } 
                else if(i == e) {
                    numList.add(-1);
                }
                   
            }
        }
        
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}