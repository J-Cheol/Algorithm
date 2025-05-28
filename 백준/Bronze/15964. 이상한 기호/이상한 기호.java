import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());

		System.out.println((A + B) * (A - B));
		
		sc.close();
	}
}