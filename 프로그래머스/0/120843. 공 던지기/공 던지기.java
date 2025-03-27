class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        for(int i = 0; i + 1 < k; i++) {
            index += 2;
            index %= numbers.length;
        }
        
        answer = numbers[index];
        return answer;
    }
}