import java.util.Arrays;
class Solution 
{
    public int[] solution(int[] num_list) 
    {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        int i = 0;
        for(int num : num_list)
        {
            if(i == num_list.length - 5)
                break;
            answer[i] = num_list[5 + i];
            i++;
        }
        return answer;
    }
}