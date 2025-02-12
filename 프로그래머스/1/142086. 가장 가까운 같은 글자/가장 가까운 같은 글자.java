import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(!map.containsKey(c)) {
                answer[i] = -1;
            }
            else {
                answer[i] = i - map.get(c);
            }
            map.put(c, i);
            i++;
        }
        return answer;
    }
}