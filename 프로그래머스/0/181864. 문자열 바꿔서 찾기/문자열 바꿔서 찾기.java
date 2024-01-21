class Solution 
{
    public int solution(String myString, String pat) 
    {
        myString = myString.replace("A", "a").replace("B","b").replace("a", "B").replace("b", "A");
        int answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }
}