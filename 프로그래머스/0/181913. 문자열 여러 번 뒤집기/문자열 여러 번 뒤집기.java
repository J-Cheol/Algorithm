class Solution {
    public String solution(String my_string, int[][] queries) {
        
        String[] strArray = my_string.split("");
        
        for(int[] query : queries) {
            reverse(strArray, query[0], query[1]);
        }
        
        String answer = String.join("", strArray);
        return answer;
    }
    
    private void reverse(String[] strArray, int start, int end) {
        int i = start;
        int j = end;
        while(i < j) {
            String temp = "";
            temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }
    }
}