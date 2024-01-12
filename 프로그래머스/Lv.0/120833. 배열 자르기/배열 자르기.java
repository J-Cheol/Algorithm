class Solution 
{
    public int[] solution(int[] numbers, int num1, int num2) 
    {
        int[] answer = new int[num2 - num1 + 1];
        int i = 0;
        while(i + num1 <= num2 && num2 < numbers.length)
        {
            answer[i] = numbers[i + num1];
            i++;
        }
        return answer;
    }
}