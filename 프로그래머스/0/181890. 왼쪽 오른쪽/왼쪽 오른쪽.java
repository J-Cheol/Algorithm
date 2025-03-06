class Solution {
    public String[] solution(String[] str_list) {
        int index = -1;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return new String[0];
        }

        if (str_list[index].equals("l")) {
            String[] answer = new String[index];
            for (int j = 0; j < index; j++) {
                answer[j] = str_list[j];
            }
            return answer;
        } 
        else {
            String[] answer = new String[str_list.length - index - 1];
            for (int j = index + 1; j < str_list.length; j++) {
                answer[j - index - 1] = str_list[j];
            }
            return answer;
        }
    }
}
