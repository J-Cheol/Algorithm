class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for(int num : absolutes) {
        
            if(signs[i] == true) {
                answer += num;
            }
            else if(signs[i] == false) {
                answer -= num;
            }
            
            i++;
        }
        return answer;
    }
}