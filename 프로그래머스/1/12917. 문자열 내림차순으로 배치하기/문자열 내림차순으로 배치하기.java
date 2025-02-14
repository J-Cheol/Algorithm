class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        int i = 0;
        while(i + 1 < charArr.length) {
            int j = i + 1;
            while(j < charArr.length) {
                if(charArr[i] < charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
                j++;
            }
            i++;
        }
        String answer = new String(charArr);
        
        return answer;
    }
}