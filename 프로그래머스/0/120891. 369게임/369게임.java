class Solution 
{
    public int solution(int order) 
    {
        int answer = 0;
        while(order > 0)
        {
            int check = order % 10;
            if(check == 3 || check == 6 || check == 9)
                answer++;
            order /= 10;
        }
        return answer;
    }
}