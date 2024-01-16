class Solution 
{
    public int[] solution(int n, int k) 
    {
        int count = 0;
        int factor = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % k == 0 && factor == 0)
            {
                factor = i;
                count++;
            }
            else if(i % k == 0)
            {
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i = 0; i < count; i++)
        {
            answer[i] = factor * (i + 1);
        }
        return answer;
    }
}