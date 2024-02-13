class Solution 
{
    public String solution(String myString, String pat) 
    {
        String answer = myString;
        
        for(int i = 0; i <= myString.length() - pat.length(); i++)
        {
            
            if(answer.endsWith(pat))
                break;
            else
                answer = answer.substring(0, answer.length() - 1);
        }
        return answer;
    }
}