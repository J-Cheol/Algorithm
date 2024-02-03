class Solution 
{
    public String solution(String letter) 
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseList;
        morseList = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String bit : morseList) {
            for (int i = 0; i < morse.length; i++) {
                if (bit.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}