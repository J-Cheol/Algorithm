class Solution {
    public int[] solution(long n) {
        String[] strArr = Long.toString(n).split("");
        int[] answer = new int[strArr.length];
        
        int len = strArr.length;
        for(int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
            answer[i] = Integer.parseInt(strArr[j]);
        }
        return answer;
    }
}