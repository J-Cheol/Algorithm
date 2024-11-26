class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int friend_height : array) {
            if(friend_height > height)
                answer++;
        }
        return answer;
    }
}