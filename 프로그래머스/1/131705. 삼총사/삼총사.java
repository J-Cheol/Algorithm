class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i + 2 < number.length; i++) {
            for(int j = i + 1; j + 1 < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}