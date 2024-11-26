import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int center = array.length / 2;
        Arrays.sort(array);
        int answer = array[center];
        return answer;
    }
}