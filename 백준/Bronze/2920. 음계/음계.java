import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int expected = first;
		boolean flag = true;
		for (int i = 0; i < 7; i++) {
			int check = sc.nextInt();
			if (first == 1) {
				expected++;
			} else if (first == 8) {
				expected--;
			}

			if (check != expected) {
				flag = false;
				break;
			}
		}
		if (flag && first == 1) {
			System.out.println("ascending");
		} else if (flag && first == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}