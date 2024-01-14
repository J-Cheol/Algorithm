class Solution
{
    public int solution(int[] numbers) 
    {
        int i = 0;
        while(i + 1 < numbers.length)
        {
            int j = i + 1;
            while(j < numbers.length)
            {
                if(numbers[i] < numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                j++;
            }
            i++;
        }
        int answer = numbers[0] * numbers[1];
        return answer;
    }
}