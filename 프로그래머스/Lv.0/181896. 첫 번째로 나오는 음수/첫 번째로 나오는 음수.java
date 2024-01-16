class Solution 
{
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int negative = 0;
        for(int num : num_list)
        {
            if(num >= 0)
                answer++;
            else if(num < 0)
            {
                negative = num;
                break;
            }
        }
        if(negative >= 0)
            answer = -1;
        return answer;
    }
}