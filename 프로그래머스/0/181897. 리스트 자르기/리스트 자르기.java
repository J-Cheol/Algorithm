import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[] solution(int n, int[] slicer, int[] num_list) 
    {
        List<Integer> cut_list = new ArrayList<>();
        if(n == 1)
        {
            for(int i = 0; i <= slicer[1]; i++)
            {
                cut_list.add(num_list[i]);
            }
        }
        else if(n == 2)
        {
            for(int i = slicer[0]; i < num_list.length; i++)
            {
                cut_list.add(num_list[i]);
            }
        }
        else if(n == 3)
        {
            for(int i = slicer[0]; i <= slicer[1]; i++)
            {
                cut_list.add(num_list[i]);
            }
        }
        else
        {
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2])
            {
                cut_list.add(num_list[i]);
            }
        }
        int[] answer = new int[cut_list.size()];
        int i = 0;
        for(int num : cut_list)
        {
            answer[i++] = num;
        }
        return answer;
    }
}