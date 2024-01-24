class Solution 
{
    public int solution(int num, int k) 
    {
        String num_str = Integer.toString(num);
        int count = 0;
        int flag = 0;
        for(char ch : num_str.toCharArray())
        {
            if(ch != k + '0')
            {
                count++;
            }
            else if(ch == k + '0')
            {
                count++;
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            count = -1;
        }
        int answer = count;
        
        return answer;
    }
}