class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0;
        int max_v = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int h = Math.max(sizes[i][0], sizes[i][1]);
            int v = Math.min(sizes[i][0], sizes[i][1]);
            max_h = Math.max(max_h, h);
            max_v = Math.max(max_v, v);
        }
        answer = max_h * max_v;
        return answer;
    }
}