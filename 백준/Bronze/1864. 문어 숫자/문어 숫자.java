import java.io.*;
import java.util.*;

public class Main {
    static int mapChar(char c) {
        switch (c) {
            case '-': return 0;
            case '\\': return 1;
            case '(': return 2;
            case '@': return 3;
            case '?': return 4;
            case '>': return 5;
            case '&': return 6;
            case '%': return 7;
            case '/': return -1;
            default: throw new IllegalArgumentException("Invalid char: " + c);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder out = new StringBuilder();
        while ((s = br.readLine()) != null) {
            if (s.equals("#")) break;
            long val = 0;
            for (int i = 0; i < s.length(); i++) {
                val = val * 8 + mapChar(s.charAt(i));
            }
            out.append(val).append('\n');
        }
        System.out.print(out.toString());
    }
}
