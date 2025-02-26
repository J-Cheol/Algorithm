class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] divisorCount = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j += i) {
                divisorCount[j]++;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if(divisorCount[i] == 2) {
                answer++;
            }
        }
        return answer;
    }
}