class Solution 
{
    public int solution(int i, int j, int k) 
    {
        int answer = 0;
        while(i <= j)
        {
            if(i < 10 && i == k)
            {
                answer++;
            }
            else if(i >= 10)
            {
                int check = i;
                
                while(check != 0)
                {
                    int check2 = check % 10;
                    if(check2 == k)
                        answer++;
                    check /= 10;
                }
            }
            i++;
        }
        return answer;
    }
}