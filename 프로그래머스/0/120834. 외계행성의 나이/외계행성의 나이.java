class Solution 
{
    public String solution(int age) 
    {
        String str_age = "" + age;
        String answer = "";
        
        for(char ch : str_age.toCharArray())
        {
            answer += (char)(ch - '0' + 'a');
        }
        
        return answer;
    }
}