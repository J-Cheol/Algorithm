import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int start = 0, end = B.length - 1; start < A.length; start++, end--) {
            answer += A[start] * B[end];
        }
        
        return answer;
    }
}