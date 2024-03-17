class Solution 
{
    public String solution(int q, int r, String code) 
    {
        String answer = "";
        
        int i = 0;
        for(char c : code.toCharArray())
        {
            if(i % q == r)
            {
                answer += c;
            }
            i++;
        }
        return answer;
    }
}