class Solution 
{
    public String[] solution(String[] todo_list, boolean[] finished) 
    {
        int false_count = 0;
        for(boolean check : finished)
        {
            if(check == false)
                false_count++;
        }        
        String[] answer = new String[false_count];
        int i = 0;
        int j = 0;
        for(String todo : todo_list)
        {
            if(finished[i] == false)
            {
                answer[j] = todo_list[i];
                j++;
            }
            i++;
        }
        return answer;
    }
}