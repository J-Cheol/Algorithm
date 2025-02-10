class Solution {
    public int solution(String s) {
        String[] englishNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] NumArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i < englishNum.length; i++) {
            s = s.replaceAll(englishNum[i], NumArr[i]);
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}