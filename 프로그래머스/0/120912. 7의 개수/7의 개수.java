class Solution 
{
    public int solution(int[] array) 
    {
        int answer = 0;
        int i = 0;
        while(i < array.length)
        {
            int temp = array[i];
            while(temp != 0)
            {
                if(temp % 10 == 7)
                    answer++;
                temp /= 10;
            }

            i++;
        }
        return answer;
    }
}