class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            while(s <= e) {
                if(s % k == 0) {
                    answer[s]++;    
                }
                
                s++;
            }
        }
        return answer;
    }
}