class Solution 
{
    public String solution(String myString) 
    {
        String answer = "";
        for(char alp : myString.toUpperCase().toCharArray())
        {
            if(alp >= 'B' && alp <= 'Z')
                answer += (char)(alp + 32);
            else
                answer += alp;
        }
        return answer;
    }
}