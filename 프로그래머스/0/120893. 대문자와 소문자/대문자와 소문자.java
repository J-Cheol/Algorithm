class Solution 
{
    public String solution(String my_string) 
    {
        String answer = "";
        for(char alphabet : my_string.toCharArray())
        {
            if(alphabet >= 'a' && alphabet <= 'z')
                answer += (char)(alphabet - 32);
            else if(alphabet >= 'A' && alphabet <= 'Z')
                answer += (char)(alphabet + 32);
        }
        return answer;
    }
}