import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int addHour = (B + C) / 60;
		int minute = (B + C) % 60;
		int hour = (A + addHour) % 24;
		System.out.println(hour + " " + minute);

		sc.close();
	}
}