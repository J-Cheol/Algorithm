import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] average = new double[n];

        for (int i = 0; i < n; i++) {
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        double[] sorted = average.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (average[i] == sorted[j]) {
                    answer[i] = n - j;
                    break;
                }
            }
        }

        return answer;
    }
}