import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> numList = new ArrayList<>();
        
        int i = 0;
        int sum = 0;
        while(i + 1 < numbers.length) {
            int j = i + 1;
            while(j < numbers.length) {
                sum = numbers[i] + numbers[j];
                if(!numList.contains(sum)) {
                    numList.add(sum);
                }
                j++;
            }
            i++;
        }
        
        int[] answer = new int[numList.size()];
        for(int k = 0; k < numList.size(); k++) {
            answer[k] = numList.get(k);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}