class Solution 
{
    public String solution(String cipher, int code) 
    {
        String answer = "";
        int i = 1;
        for(char cip : cipher.toCharArray())
        {
            if(i % code == 0)
            {
                answer += cip;
            }
            i++;
        }
        return answer;
    }
}