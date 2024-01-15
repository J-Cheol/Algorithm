class Solution 
{
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int result_1 = 0;
        int result_2 = 1;
        
        for(int num : num_list)
        {
            result_1 += num;
            result_2 *= num;
        }
        if(result_1 * result_1 > result_2)
            answer = 1;
        
        return answer;
    }
}