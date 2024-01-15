class Solution 
{
    public int solution(int n, String control) 
    {
        int answer = n;
        for(char command : control.toCharArray())
        {
            if(command == 'w')
                answer += 1;
            else if(command == 's')
                answer -= 1;
            else if(command == 'd')
                answer += 10;
            else if(command == 'a')
                answer -= 10;
        }
        return answer;
    }
}