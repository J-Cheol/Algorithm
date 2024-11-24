class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int len = 0;
        for(int num : numbers) {
            len++;
            answer += num;
        }
        answer = answer / len;
        return answer;
    }
}