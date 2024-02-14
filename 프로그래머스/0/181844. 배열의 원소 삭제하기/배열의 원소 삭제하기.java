import java.util.List;
import java.util.ArrayList;
class Solution 
{
    public int[] solution(int[] arr, int[] delete_list) 
    {
        List<Integer> arr_list = new ArrayList<>();
        for(int num : arr)
        {
            arr_list.add(num);
        }
        for(int i = 0; i < delete_list.length; i++)
        {
            if(arr_list.contains(delete_list[i]))
                arr_list.remove(Integer.valueOf(delete_list[i]));
        }
        int[] answer = new int[arr_list.size()];
        for (int i = 0; i < arr_list.size(); i++) 
        {
            answer[i] = arr_list.get(i);
        }
        return answer;
    }
}