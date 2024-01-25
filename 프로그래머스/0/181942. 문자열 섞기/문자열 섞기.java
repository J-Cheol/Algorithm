class Solution 
{
    public String solution(String str1, String str2) 
    {
        String answer = "";
        char[] str_A = str1.toCharArray();
        char[] str_B = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++)
        {
            answer += str_A[i];
            answer += str_B[i];
        }
        
        return answer;
    }
}