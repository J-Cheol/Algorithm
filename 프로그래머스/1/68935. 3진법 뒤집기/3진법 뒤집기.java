class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String third = Integer.toString(n, 3);
        String[] thirdArr = third.split("");

        int start = 0;
        int end = thirdArr.length - 1;
        
        while(start < end) {
            String temp = thirdArr[start];
            thirdArr[start] = thirdArr[end];
            thirdArr[end] = temp;
            
            start++;
            end--;
        }
        
        third = String.join("", thirdArr);
        answer = Integer.parseInt(third, 3);
        return answer;
    }
}