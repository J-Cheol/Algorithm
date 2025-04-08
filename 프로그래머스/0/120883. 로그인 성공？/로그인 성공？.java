class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        String id = id_pw[0];
        String password = id_pw[1];
        
        for(String[] db_id : db) {
            if(db_id[0].equals(id)) {
                if(db_id[1].equals(password)) {
                    answer = "login";
                }
                else {
                    answer = "wrong pw";
                }
                break;
            }
        }
        return answer;
    }
}