import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public int solution(String[] strArr) 
    {
        int[] len_arr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++)
        {
            len_arr[i] = strArr[i].length();
        }
        Arrays.sort(len_arr);
        List<Integer> check_list = new ArrayList<>();
        int check = 0;
        int len = 0;
        for(int i = 0; i < len_arr.length; i++)
        {
            if(i == 0)
            {
                check++;
                len = len_arr[0];
            }
            else if(len == len_arr[i])
            {
                check++;
            }
            else if(len != len_arr[i])
            {
                check_list.add(check);
                len = len_arr[i];
                check = 1;
            }
        }
        check_list.add(check);
        
        int answer = Collections.max(check_list);
        return answer;
    }
}