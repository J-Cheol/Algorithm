class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
    
    private static int combination(int balls, int share) {
        if(balls == share || share == 0) {
            return 1;
        }
        else
            return combination(balls - 1, share - 1) + combination(balls - 1, share);
    }
}