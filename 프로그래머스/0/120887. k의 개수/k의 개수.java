class Solution 
{
    public int solution(int i, int j, int k) 
    {
        int answer = 0;
        while(i <= j)
        {
            int check = i;
            while(check != 0)
            {
                if(check % 10== k)
                    answer++;
                check /= 10;
            }
            i++;
        }
        return answer;
    }
}