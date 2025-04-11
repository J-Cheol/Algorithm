class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if(M == 1 && N == 1) {
            return answer;
        }
        
        int i = M;
        
        while(i >= 1) {
            int j = N;
            while(j > 1) {
                answer++;
                j--;
            }
            if(i != 1)
                answer++;
            i--;
        }
        return answer;
    }
}