import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		int n = 0;

		if (x > 0 && y > 0) {
			n = 1;
		} else if(x < 0 && y > 0) {
			n = 2;
		} else if(x < 0 && y < 0) {
			n = 3;
		} else if(x > 0 && y < 0) {
			n = 4;
		}
		System.out.println(n);
	}
}