class Solution 
{
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int even = 0;
        int odd = 0;
        int flag_even = 0;
        int flag_odd = 0;
        for(int num : num_list)
        {
            if(num % 2 == 0 && flag_even == 0)   
            {
                even += num;
                flag_even = 1;
            }
            else if(num % 2 != 0 && flag_odd == 0)
            {
                odd += num;
                flag_odd = 1;
            }
            else if(num % 2 == 0 && flag_even == 1)
            {
                even = (even * 10) + num;
            }
            else if(num % 2 != 0 && flag_odd == 1)
            {
                odd = (odd * 10) + num;
            }
        }
        answer = even + odd;
        return answer;
    }
}