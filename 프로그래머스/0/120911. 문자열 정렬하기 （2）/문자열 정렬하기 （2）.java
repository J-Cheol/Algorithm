import java.util.Arrays;
class Solution 
{
    public String solution(String my_string) 
    {
        String[] bits = my_string.toLowerCase().split("");
        Arrays.sort(bits);
        
        String answer = "";
        for(String bit : bits)
        {
            answer += bit;
        }
        return answer;
    }
}