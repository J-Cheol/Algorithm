import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution 
{
    public String[] solution(String[] strArr) 
    {
        List<String> str_list = new ArrayList<>(Arrays.asList(strArr));

        for(int i = 0; i < str_list.size(); i++)
        {
            if(str_list.get(i).contains("ad"))
            {
                str_list.remove(i--);
            }                
        }
        String[] answer = new String[str_list.size()];
        for(int i = 0; i < str_list.size(); i++)
        {
            answer[i] = str_list.get(i);
        }
        return answer;
    }
}