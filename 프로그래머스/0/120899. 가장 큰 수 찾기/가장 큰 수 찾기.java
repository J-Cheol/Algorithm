class Solution 
{
    public int[] solution(int[] array) 
    {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        for(int num : array)
        {
            if(answer[0] < num)
                answer[0] = num;
        }
        for(int num : array)
        {
            if(answer[0] == num)
                break;
            answer[1]++;
        }
        return answer;
    }
}