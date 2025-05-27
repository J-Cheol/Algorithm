import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] assignment = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int attendanceNumber = Integer.parseInt(br.readLine());
            assignment[attendanceNumber - 1] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if(!assignment[i - 1]){
                System.out.println(i);
            }
        }
        br.close();
	}
}