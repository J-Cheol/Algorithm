import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int countO = 0;
		for(int i = 0; i < N; i++) {
			if(s.charAt(i) == 'O') {
				countO++;
			}
		}

		int half = (N + 1) / 2;
		System.out.println(countO >= half ? "Yes" : "No" );

		sc.close();
	}
}