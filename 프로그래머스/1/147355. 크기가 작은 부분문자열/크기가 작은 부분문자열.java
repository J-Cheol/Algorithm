class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        while(true) {
            try {
                String cut = t.substring(start, p.length() + start);
                if(Long.parseLong(p) >= Long.parseLong(cut)) {
                    answer++;
                }
                    start++;
            } catch (Exception e) {
                break;    
            }
                
        }

        return answer;
    }
}