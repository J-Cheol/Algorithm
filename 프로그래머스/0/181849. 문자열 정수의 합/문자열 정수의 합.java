class Solution 
{
    public int solution(String num_str) 
    {
        int answer = 0;
        for(char num : num_str.toCharArray())
        {
            answer += (char)(num - 48);
        }
        return answer;
    }
}