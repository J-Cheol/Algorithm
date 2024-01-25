import java.util.Arrays;
class Solution 
{
    public String solution(String my_string, int[] indices) 
    {
        Arrays.sort(indices);
        String[] str_arr = my_string.split("");
        String answer = "";
        int idx = 0;
        for(int i = 0; i < my_string.length(); i++)
        {
            if(idx < indices.length && indices[idx] == i)
                idx++;
            else
                answer += str_arr[i];
        }
        return answer;
    }
}