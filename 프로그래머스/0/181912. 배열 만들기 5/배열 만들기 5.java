class Solution 
{
    public int[] solution(String[] intStrs, int k, int s, int l) 
    {
        int len = 0;
        for(String intStr : intStrs)
        {
            intStr = intStr.substring(s, s + l);
            if(Integer.parseInt(intStr) > k)
                len++;
        }
        int[] answer = new int[len];
        int i = 0;
        for(String intStr : intStrs)
        {
            intStr = intStr.substring(s, s + l);
            if(Integer.parseInt(intStr) > k)
            {
                answer[i++] = Integer.parseInt(intStr);
            }
        }
        return answer;
    }
}