class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        StringBuilder result = new StringBuilder();
        
        int lenA = a.length();
        int lenB = b.length();
        
        int carry = 0;
        int i = lenA - 1;
        int j = lenB - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            
            int sum = digitA + digitB + carry;
            result.append(sum % 10);
            carry = sum / 10;
            
            i--;
            j--;
        }
        
        answer = result.reverse().toString();
        return answer;
    }
}