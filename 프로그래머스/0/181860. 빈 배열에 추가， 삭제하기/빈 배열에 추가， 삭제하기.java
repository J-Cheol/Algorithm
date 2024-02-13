import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[] solution(int[] arr, boolean[] flag) 
    {
        List<Integer> arr_list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(flag[i])
            {
                for(int j = 0; j < arr[i] * 2; j++)
                    arr_list.add(arr[i]);
            }
            else if(!flag[i])
            {
                for(int j = 0; j < arr[i]; j++)
                {
                    int last_index = arr_list.size() - 1;
                    arr_list.remove(last_index);
                }
            }   
        }
        int[] answer = new int[arr_list.size()];
        for(int idx = 0; idx < answer.length; idx++)
        {
            answer[idx] = arr_list.get(idx);
        }
        return answer;
    }
}