import java.util.List;
import java.util.ArrayList;
class Solution 
{
    public int[] solution(int n) 
    {
        List<Integer> num = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                num.add(i);
        }
        int[] answer = new int[num.size()];
        for(int i = 0; i < num.size(); i++)
        {
            answer[i] = num.get(i);
        }
        return answer;
    }
}