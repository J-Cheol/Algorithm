import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public String solution(String s) 
    {
        List<Character> charList = new ArrayList<>();
        List<Character> duplicates = new ArrayList<>();

        for(Character c : s.toCharArray())
        {
            if (!charList.contains(c)) 
            {
                if (!duplicates.contains(c)) 
                {
                    charList.add(c);
                }
            } 
            else 
            {
                charList.remove(c);
                duplicates.add(c);
            }
        }
        
        charList.sort(Character::compareTo);
        
        StringBuilder sb = new StringBuilder();
        for(Character character : charList)
        {
            sb.append(character);
        }
        
        return sb.toString();
    }
}
