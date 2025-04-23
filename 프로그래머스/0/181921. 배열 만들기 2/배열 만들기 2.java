import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (isValid(i)) {
                resultList.add(i);
            }
        }
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    private static boolean isValid(int num) {
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}