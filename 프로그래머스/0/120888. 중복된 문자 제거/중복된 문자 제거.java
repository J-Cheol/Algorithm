class Solution 
{
    public String solution(String my_string) 
    {
        String answer = "";
        for(String bit : my_string.split(""))
        {
            if(!answer.contains(bit))
                answer += bit;
        }
        return answer;
    }
}