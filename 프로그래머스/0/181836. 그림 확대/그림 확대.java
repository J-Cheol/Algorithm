class Solution {
    public String[] solution(String[] picture, int k) {
        int n = picture.length;
        int m = picture[0].length();
        String[] answer = new String[n * k];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                char ch = picture[i].charAt(j);
                for (int t = 0; t < k; t++) {
                    sb.append(ch);
                }
            }
            String line = sb.toString();
            for (int t = 0; t < k; t++) {
                answer[idx++] = line;
            }
        }
        return answer;
    }
}
