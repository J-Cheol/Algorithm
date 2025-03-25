class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b = sides[1];
        
        for(int c = 1; c < a + b; c++) {
            if(c < a + b && a < b + c && b < a + c) {
                answer++;
            }
        }
        return answer;
    }
}