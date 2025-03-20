class Solution {
    public String solution(int n) {
        String answer = "";
        String str1 = "수";
        String str2 = "박";
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer += str1;
            }
            else {
                answer += str2;
            }
        }
        return answer;
    }
}