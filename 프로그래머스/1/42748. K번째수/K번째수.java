import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        
        while(i < commands.length) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            int[] num = Arrays.copyOfRange(array, start, end);
            Arrays.sort(num);
            answer[i] = num[k];
            
            i++;
        }
        return answer;
    }
}