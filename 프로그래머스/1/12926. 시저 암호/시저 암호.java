class Solution {
    public String solution(String s, int n) {
        
        char[] charArr = s.toCharArray();
        int i = 0;
        for(char c : charArr) {
            if((c >= 'a' && c <= 'z')) {
                
                if(c + n > 'z') {
                    charArr[i] = (char)((c + n - 'z' - 1) + 'a');
                }
                else
                    charArr[i] = (char)(c + n);
            }
            else if(c >= 'A' && c <= 'Z') {
                if(c + n > 'Z') {
                    charArr[i] = (char)((c + n - 'Z' - 1) + 'A');
                }
                else
                    charArr[i] = (char)(c + n);
            }
            i++;
        }
        
        String answer = new String(charArr);
        return answer;
    }
}