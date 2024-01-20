class Solution 
{
    public int solution(int[] num_list) 
    {
        int odd = 0;
        int even = 0;
        int i = 0;
        for(int num : num_list)
        {
            if(i % 2 == 1)
                even += num;
            else if(i % 2 == 0)
                odd += num;
            i++;
        }
        int answer = Math.max(even, odd);
        return answer;
    }
}