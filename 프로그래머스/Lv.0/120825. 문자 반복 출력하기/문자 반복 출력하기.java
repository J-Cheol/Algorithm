class Solution 
{
    public String solution(String my_string, int n) 
    {
        String answer = "";
        char[] alp = my_string.toCharArray();
        int i = 0;
        while(i < my_string.length())
        {
            int j = 0;
            while(j < n)
            {
                answer += alp[i];
                j++;
            }
            i++;
        }
        return answer;
    }
}