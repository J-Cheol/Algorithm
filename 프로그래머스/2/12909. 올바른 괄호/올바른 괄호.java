class Solution {
    boolean solution(String s) {
        int check = 0;
        
        char[] charArray = s.toCharArray();
        
        for(char c : charArray) {
            if(c == '(') {
                check++;
            }
            else if(c == ')') {
                check--;
            }
            if(check < 0) {
                return false;
            }
        }

        return check == 0 ? true : false;
    }
}