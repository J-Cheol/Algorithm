class Solution 
{
    public int solution(String myString, String pat) 
    {
        int answer = 0;
        int i = 0;
        while(pat.length() + i <= myString.length())
        {
            if(myString.substring(i, i + pat.length()).equals(pat))
                answer++;
            i++;
        }
        return answer;
    }
}