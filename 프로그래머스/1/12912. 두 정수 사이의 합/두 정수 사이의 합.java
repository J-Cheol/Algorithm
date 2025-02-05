class Solution {
    public long solution(int a, int b) {
        if(a == b)
            return a;
        long answer = 0;
        if(a < b) {
            while(a <= b) {
                answer += a;
                a++;
            }            
        }
        else if(a > b) {
            while(a >= b) {
                answer += b;
                b++;
            }   
        }
        return answer;
    }
}