class Solution 
{
    public String[] solution(String[] names) 
    {
        int len = 0;
        if(names.length < 5)
            len = 1;
        else if(names.length % 5 == 0)
            len = names.length / 5;
        else if(names.length % 5 != 0)
            len = names.length / 5 + 1;
        String[] answer = new String[len];
        int j = 0;
        for(int i = 0; i < names.length; i++)
        {
            if(i % 5 == 0)
                answer[j++] = names[i];
        }
        return answer;
    }
}