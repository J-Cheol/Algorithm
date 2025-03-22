class Solution {
    public String solution(String s) {
        boolean flag = true;
        s = s.toLowerCase();
        
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ' ') {
                flag = true;
            }
            else if(flag == true && (charArray[i] >= 'a'&& charArray[i] <= 'z')) {
                flag = false;
                charArray[i] -= 32; 
            }
            else {
                flag = false;
            }
        }
        
        String answer = new String(charArray);
        return answer;
    }
}