class Solution 
{
    public String[] solution(String[] strArr) 
    {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i += 2)
        {
            strArr[i] = strArr[i].toLowerCase();
            answer[i] = strArr[i];
        }
        for(int i = 1; i < strArr.length; i += 2)
        {
            strArr[i] = strArr[i].toUpperCase();
            answer[i] = strArr[i];
        }
        return answer;
    }
}