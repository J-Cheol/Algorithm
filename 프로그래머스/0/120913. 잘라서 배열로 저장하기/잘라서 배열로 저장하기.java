import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> str_list = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i += n) {
            int end_index = Math.min(i + n, my_str.length());
            str_list.add(my_str.substring(i, end_index));
        }
        
        int len = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[len];
        for(int i = 0; i < str_list.size(); i++) {
            answer[i] = str_list.get(i);
        }
        return answer;
    }
}