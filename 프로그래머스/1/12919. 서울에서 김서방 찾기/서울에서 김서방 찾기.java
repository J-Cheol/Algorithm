class Solution {
    public String solution(String[] seoul) {
        String kim = "김서방은 ";
        String location = "";
        String existence = "에 있다";
        int i = 0;   
        for (String str : seoul) {
            if(str.equals("Kim")) {
                location = i + "";
                break;
            }
            i++;
        }
        return kim + location + existence;
    }
}