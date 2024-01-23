import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public String[] solution(String myString) 
    {
        String[] bits = myString.split("x");
        List<String> str_list = new ArrayList<>();
        for(String bit : bits)
        {
            if(!bit.equals(""))
                str_list.add(bit);
        }
        String[] answer = new String[str_list.size()];
        for(int i = 0; i < str_list.size(); i++)
        {
            answer[i] = str_list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}