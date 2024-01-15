class Solution 
{
    public int solution(int a, int b) 
    {
        int answer = 0;
        String str_1 = "" + a + b;
        String str_2 = "" + (a * b * 2);
        int num1 = Integer.parseInt(str_1);
        int num2 = Integer.parseInt(str_2);
        
        answer = num1 >= num2 ? num1 : num2;
        return answer;
    }
}