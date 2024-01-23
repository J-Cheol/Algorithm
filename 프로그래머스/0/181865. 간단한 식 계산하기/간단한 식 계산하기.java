class Solution 
{
    public int solution(String binomial) 
    {
        int answer = 0;
        String[] bits = binomial.split(" ");
        switch(bits[1])
        {
            case "+" :
                answer = Integer.parseInt(bits[0]) + Integer.parseInt(bits[2]);
                break;
            case "-" :
                answer = Integer.parseInt(bits[0]) - Integer.parseInt(bits[2]);
                break;
            case "*" :
                answer = Integer.parseInt(bits[0]) * Integer.parseInt(bits[2]);
                break;
        }
        return answer;
    }
}