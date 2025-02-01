class Solution {
    public long solution(long n) {
        String numberStr = Long.toString(n);
        
        char[] numberChar = numberStr.toCharArray();
        
        int i = 0;
        while(i + 1< numberChar.length) {
            int j = i + 1;
            while(j < numberChar.length) {
                if(numberChar[i] < numberChar[j]) {
                    char temp = numberChar[i];
                    numberChar[i] = numberChar[j];
                    numberChar[j] = temp;
                }
                j++; 
            }
            i++;
        }
        
        String answerStr = new String(numberChar);
        long answer = new Long(answerStr);
        return answer;
    }
    
}