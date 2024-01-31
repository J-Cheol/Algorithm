class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        for(int i = 4; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                answer++;
            }
            else
            {
                int count = 0;
                for(int j = 1; j <= i; j += 2)
                {
                    if(i % j == 0)
                    {
                        count++;
                    }
                }
                if(count > 2)
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}