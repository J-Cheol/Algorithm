class Solution 
{
    public String solution(String my_string, int[] index_list) 
    {
        String answer = "";
        int i = 0;
        while(i < index_list.length)
        {
            answer += my_string.substring(index_list[i], index_list[i] + 1);
            i++;
        }
        return answer;
    }
}