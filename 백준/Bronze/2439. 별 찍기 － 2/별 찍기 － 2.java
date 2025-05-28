import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean flag = false;
		for (int y = 1; y <= n; y++) {
			for (int x = 1; x <= n; x++) {
				if (x == n - y + 1) {
					flag = true;
				}

				if (flag) {
					System.out.print("*");
					if(x == n) {
						System.out.println("");
					}
				} else {
					System.out.print(" ");
				}
			}
			flag = false;
		}
		sc.close();
	}
}