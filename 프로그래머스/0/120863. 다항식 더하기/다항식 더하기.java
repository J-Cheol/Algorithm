class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        
        for(String number : polynomial.split(" ")) {
            if(number.equals("x")) {
                a++;
            }
            else if(number.contains("x")) {
                number = number.replace("x", "");
                
                a += Integer.parseInt(number);
            }
            else if(!number.equals("+")) {
                b += Integer.parseInt(number);
            }
        }
        
        if(a > 0) {
            if(a == 1) {
                answer += "x";
            }
            else {
                answer += a + "x";
            }
        }
        if(b > 0) {
            if(!answer.isEmpty()) {
                answer += " + ";
            }
            answer += b;
        }
        if(answer.isEmpty()) {
            answer = "0";
        }
        return answer;
    }
}