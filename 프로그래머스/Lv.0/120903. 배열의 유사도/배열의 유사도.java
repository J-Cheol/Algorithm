class Solution 
{
    public int solution(String[] s1, String[] s2) 
    {
        int answer = 0;
        int i = 0;
        while(i < s1.length)
        {
            int j = 0;
            while(j < s2.length)
            {
                if(s1[i].equals(s2[j]))
                answer++;
                j++;
            }
            i++;
        }
        return answer;
    }
}