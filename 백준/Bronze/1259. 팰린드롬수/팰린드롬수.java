import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();

			if (str.equals("0")) {
				break;
			}

			int len = str.length();
			boolean flag = true;
			for (int i = 0; i < len / 2; i++) {

				char a = str.charAt(i);
				char b = str.charAt(len - 1 - i);

				if (a != b) {
					flag = false;
					break;
				}
			}

			System.out.println(flag ? "yes" : "no");
		}
	}
}