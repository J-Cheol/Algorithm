class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int len = phone_number.length();
        
        for(int i = 1; len - i >= 4; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(len - 4);
        return answer;
    }
}