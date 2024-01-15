class Solution 
{
    public int solution(String my_string) 
    {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]","");
        for(char num : my_string.toCharArray())
        {
            answer += num - 48;
        }
        return answer;
    }
}