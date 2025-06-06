class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int i = 0;
        for(String s : code.split("")) {
            if(s.equals("1")) {
                if(mode == 0) {
                    mode++;
                }
                else if(mode == 1) {
                    mode--;
                }
            }
            else {
                if(mode == 0 && i % 2 == 0) {
                    answer += s;
                }
                else if(mode == 1 && i % 2 == 1) {
                    answer += s;
                }
            }
            
            i++;
        }
        
        if(answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }
}