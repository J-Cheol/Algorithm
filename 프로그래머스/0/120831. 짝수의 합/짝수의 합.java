class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; n > 0; n = n - i)
        {
            if(n % 2 == 0)
                answer += n;
        }
        return answer;
    }
}