class Solution {
    public String solution(String s) {
        
        char[] charArr = s.toLowerCase().toCharArray();
        int checkIndex = 0;
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' ') {
                checkIndex = 0;
            }
            else if(checkIndex % 2 == 0 && charArr[i] >= 'a' && charArr[i] <= 'z') {
                charArr[i] = (char)(charArr[i] - 32); 
                checkIndex++;
            }
            else
                checkIndex++;
        }
        String answer = new String(charArr);
        return answer;
    }
}