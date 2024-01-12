class Solution 
{
    public String solution(String myString) 
    {
        // String answer = myString.toUpperCase();
        String answer = "";
        
        char[] alphabets = myString.toCharArray();
        for (char alphabet : alphabets)
        {
            if(alphabet >= 'a' && alphabet <= 'z')
                answer += (char)(alphabet - 32);
            else
                answer += alphabet;
        }
        return answer;
    }
}
