class Solution 
{
    public int[] solution(int[] num_list, int n) 
    {
        int[] answer = new int[num_list.length];
        int i = 0;
        int j = n;
        while(i < num_list.length)
        {
            if(j < num_list.length)
                answer[i] = num_list[j];
            else if(j == num_list.length)
            {
                j = 0;
                answer[i] = num_list[j];
            }
            i++;
            j++;
        }
        return answer;
    }
}