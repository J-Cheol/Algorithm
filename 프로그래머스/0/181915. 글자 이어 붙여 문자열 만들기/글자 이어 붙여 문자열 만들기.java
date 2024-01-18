class Solution 
{
    public String solution(String my_string, int[] index_list) 
    {
        String answer = "";
        int i = 0;
        while(i < index_list.length)
        {
            if(i < index_list.length)
                answer += my_string.substring(index_list[i], index_list[i] + 1);
            else if(my_string.length() == index_list[i] + 1)
                answer += my_string.substring(index_list[i]);
            i++;
        }
        return answer;
    }
}