class Solution {
    public int[] solution(int n) {
        int len = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[len];
        for(int odd = 1, i = 0; odd <= n; odd += 2, i++) {
            answer[i] = odd;
        }
        return answer;
    }
}