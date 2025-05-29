import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		sc.close();
		
		if (str.isEmpty()) {
			System.out.println("0");
		} else {
			StringTokenizer st = new StringTokenizer(str, " ");
			System.out.println(st.countTokens());
		}
	}
}