class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        
        String[] s_split = s.split("");
        int count = 0;
        for(String str : s_split) {
            if(str.equals("p")) {
                count++;
            }
            else if(str.equals("y")) {
                count--;
            }
        }
        
        if(count != 0) {
            answer = false;
        }

        return answer;
    }
}