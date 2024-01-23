import java.util.List;
import java.util.ArrayList;
class Solution 
{
    public int[] solution(String myString) 
    {
        List<Integer> len_list = new ArrayList<>();
        int len_number = 0;
        char[] c = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++)
        {
            if(c[i] >= 'a' && c[i] <= 'z' && c[i] != 'x')
            {
                len_number++;
            }
            else if(c[i] == 'x' && len_number != 0)
            {
                len_list.add(len_number);
                len_number = 0;
            }
            else if(c[i] == 'x' && len_number == 0)
            {
                len_list.add(len_number);
            }
            if(i == myString.length() - 1)
            {
                len_list.add(len_number);
            }
        }
        int[] answer = new int[len_list.size()];
        for(int idx = 0; idx < len_list.size(); idx++)
        {
            answer[idx] = len_list.get(idx);
        }
        return answer;
    }
}