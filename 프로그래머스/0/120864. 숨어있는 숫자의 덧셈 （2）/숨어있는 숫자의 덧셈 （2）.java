class Solution 
{
    public int solution(String my_string) 
    {
        int answer = 0;
        int check = 0;
        boolean foundNumber = false;
        
        for(char c : my_string.toCharArray())
        {
            if(c >= '0' && c <= '9')
            {
                check = (check * 10) + (c - '0');
                foundNumber = true;
            }
            else if(foundNumber)
            {
                answer += check;
                check = 0;
                foundNumber = false;
            }
        }
        
        if (foundNumber) 
        {
            answer += check;
        }
        
        return answer;
    }
}