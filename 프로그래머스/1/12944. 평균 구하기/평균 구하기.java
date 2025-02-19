class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int total = arr.length;
        for(int num : arr) {
            answer += num;
        }
        answer /= total;
        return answer;
    }
}