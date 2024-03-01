import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public String[] solution(String myStr) 
    {
        List<String> myStrList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : myStr.toCharArray())
        {
            if(c == 'a' || c == 'b' || c == 'c')
            {
                if(sb.length() > 0)
                {
                    myStrList.add(sb.toString());
                    sb.setLength(0);
                }
            }
            else
            {
                sb.append(c);
            }
        }
        
        if(sb.length() > 0)
        {
            myStrList.add(sb.toString());
        }
        
        return myStrList.isEmpty() ? new String[]{"EMPTY"} : myStrList.toArray(new String[0]);
    }
}