class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String dics : dic) {
            int check = spell.length;
            for(String spells : spell) {
                if(dics.contains(spells)) {
                   check--; 
                }
            }
            if(check == 0) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}