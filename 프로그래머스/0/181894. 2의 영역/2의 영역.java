import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[] solution(int[] arr) 
    {
        List<Integer> arr_list = new ArrayList<>();
        int two_count = 0;
        for(int num : arr)
        {
            if(num == 2)
                two_count++;
        }
        
        if(two_count == 0)
        {
            return new int[]{-1};
        }
        
        int start = 0;
        for(int num : arr)
        {
            if(num == 2 && start != two_count)
            {
                start++;
                arr_list.add(num);
            }
            else if(start == two_count)
            {
                break;
            }
            else if(num != 2 && start != 0)
            {
                arr_list.add(num);
            }
        }
    
        int[] answer = new int[arr_list.size()];
        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = arr_list.get(i);
        }
        return answer;
    }
}