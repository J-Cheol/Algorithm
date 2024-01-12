class Solution 
{
    public String solution(String[] my_strings, int[][] parts) 
    {
        String answer = "";
        int i = 0;
        for(String my_str : my_strings)
        {
            answer += my_str.substring(parts[i][0], parts[i][1] + 1);
            i++;
        }
        return answer;
    }
}