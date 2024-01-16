import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[] solution(int n, int[] numlist) 
    {
        List<Integer> nums = new ArrayList<>();
        for(int num : numlist)
        {
            if(num % n == 0)
                nums.add(num);
        }
        int[] answer = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++)
        {
            answer[i] = nums.get(i);
        }
        return answer;
    }
}