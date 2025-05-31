import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		String line = sc.nextLine();

		for (int i = 0; i < line.length(); i++) {
			int a = line.charAt(i) - 'a';
			if (arr[a] == -1) {
				arr[a] = i;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString());
	}
}