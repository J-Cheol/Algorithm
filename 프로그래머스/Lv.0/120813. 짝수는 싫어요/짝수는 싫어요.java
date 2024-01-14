class Solution 
{
    public int[] solution(int n) 
    {
        int even = 0;
        int odd = 0;
        if(n % 2 == 0)
            even = n / 2;
        else
            odd = n / 2 + 1;
        int[] answer = new int[n % 2 == 0 ? even : odd];
        int j = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 1)
            {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}