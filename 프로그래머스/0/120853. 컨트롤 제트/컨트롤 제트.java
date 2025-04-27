class Solution {
    public int solution(String s) {
        int answer = 0;
        int save = 0;
        
        for(String str : s.split(" ")) {
            if(!str.equals("Z")) {
                answer += Integer.parseInt(str);
                save = Integer.parseInt(str);
            }
            else {
                answer -= save;
            }
        }
        return answer;
    }
}