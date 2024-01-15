class Solution 
{
    public int solution(int a, int b) 
    {
        int answer = 0;
        String num1 = "" + a + b;
        String num2 = "" + b + a;
        int numA = Integer.parseInt(num1);
        int numB = Integer.parseInt(num2);
        answer = numA >= numB ? numA : numB;
        return answer;
    }
}