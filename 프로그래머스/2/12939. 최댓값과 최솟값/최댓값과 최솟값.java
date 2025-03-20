class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArray = s.split(" ");
        int[] intArray = new int[strArray.length];
        int max = -2147483648;
        int min = 2147483647;
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
            max = Math.max(intArray[i], max);
            min = Math.min(intArray[i], min);
        }
        
        answer = min + " " + max;
        return answer;
    }
}