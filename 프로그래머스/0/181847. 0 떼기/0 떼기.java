class Solution 
{
    public String solution(String n_str) 
    {
        String answer = "";
        int count = 0;
        for(char str : n_str.toCharArray())
        {
            if(str == '0')
            {
                count++;
            }
            else
                break;
        }
        char[] str = n_str.toCharArray();
        for(int i = count; i < n_str.length(); i++)
        {
            answer += str[i];
        }
        return answer;
    }
}