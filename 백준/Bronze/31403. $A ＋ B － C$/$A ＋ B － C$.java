import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String B = sc.nextLine();
		int AB = Integer.parseInt(A + B);
		int C = sc.nextInt();

		System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - C);
		System.out.println(AB - C);

		sc.close();
	}
}