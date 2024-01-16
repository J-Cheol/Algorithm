class Solution 
{
    public int[] solution(int[] arr) 
    {
        int[] answer = new int[arr.length];
        int i = 0;
        for(int num : arr)
        {
            if(num >= 50 && num % 2 == 0)
                answer[i] = num / 2;
            else if(num < 50 && num % 2 != 0)
                answer[i] = num * 2;
            else
                answer[i] = num;
            i++;                
        }
        return answer;
    }
}