import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrNum = new ArrayList<>();
        int check = -1;
        for(int num : arr) {
            if(check != num) {
                arrNum.add(num);
                check = num;
            }
        }
        
        int[] answer = new int[arrNum.size()];
        
        for(int i = 0; i < arrNum.size(); i++) {
            answer[i] = arrNum.get(i);
        }
        return answer;
    }
}