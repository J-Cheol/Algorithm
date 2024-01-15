class Solution 
{
    public int solution(int n) 
    {
        int answer = plus(n, 0);
        
        return answer;
    }
    
    public static int plus(int n, int sum)
    {
        sum += n % 10;
        if(n == 0)
            return sum;
        return plus(n / 10, sum);
    }
}