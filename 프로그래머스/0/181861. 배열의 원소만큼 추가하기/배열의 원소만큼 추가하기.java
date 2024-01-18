import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[] solution(int[] arr) 
    {
        List<Integer> arr_list = new ArrayList<>();
        int i = 0;
        while(i < arr.length)
        {
            int j = arr[i];
            while(j > 0)
            {
                arr_list.add(arr[i]);
                j--;
            }
            i++;
        }
        int[] answer = new int[arr_list.size()];
        for(int idx = 0; idx < arr_list.size(); idx++)
        {
            answer[idx] = arr_list.get(idx);
        }
        return answer;
    }
}