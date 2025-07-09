import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String isbn = br.readLine();
		int starIdx = isbn.indexOf('*');
		int checkDigit = isbn.charAt(12) - '0';
		int sum = 0;

		for (int i = 0; i < 12; i++) {
			if (i == starIdx) continue;
			int num = isbn.charAt(i) - '0';
			sum += (i % 2 == 0) ? num : num * 3;
		}

		for (int x = 0; x <= 9; x++) {
			int total = sum;
			total += (starIdx % 2 == 0) ? x : x * 3;
			int calculatedCheck = (10 - (total % 10)) % 10;
			if (calculatedCheck == checkDigit) {
				System.out.println(x);
				break;
			}
		}
	}
}