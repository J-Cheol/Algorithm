class Solution 
{
    public int[] solution(int[] arr) 
    {
        int len = arr.length;
        int i = 1;

        while(i < len)
        {
            i *= 2;
        }
        
        int[] answer = new int[i];
        
        for (int idx = 0; idx < len; idx++) 
        {
            answer[idx] = arr[idx];
        }

        return answer;
    }
}