class Solution 
{
    public int[] solution(int start, int end_num) 
    {
        int[] answer = new int[start - end_num + 1];
        int start_num = start;
        for(int i = 0; start_num >= end_num; i++, start_num--)
        {
            answer[i] = start_num;
        }
        return answer;
    }
}