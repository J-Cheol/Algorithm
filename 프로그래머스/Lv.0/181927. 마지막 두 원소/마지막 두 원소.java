class Solution 
{
    public int[] solution(int[] num_list) 
    {
        int[] answer = new int[num_list.length + 1];
        int i = 0;
        for(int num : num_list)
        {
            answer[i] = num;
            i++;
        }
        if(num_list[i-1] > num_list[i-2])
            answer[i] = num_list[i-1] - num_list[i-2];
        else if(num_list[i-1] <= num_list[i-2])
            answer[i] = num_list[i-1] * 2;
        return answer;
    }
}