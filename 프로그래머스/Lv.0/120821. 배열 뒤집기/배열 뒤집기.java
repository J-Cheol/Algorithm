class Solution 
{
    public int[] solution(int[] num_list) 
    {
        int[] answer = new int[num_list.length];
        int list_index = num_list.length - 1;
        for(int num : num_list)
        {
            if(list_index < 0)
            {
                return answer;
            }
            answer[list_index] = num;
            list_index--;
            
        }
        return answer;
    }
}