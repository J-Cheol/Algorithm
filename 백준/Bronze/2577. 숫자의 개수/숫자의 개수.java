import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int multiply = A * B * C;

		int[] digitCount = new int[10];

		String multiplyString = String.valueOf(multiply);
		for(int i = 0; i < multiplyString.length(); i++){
			int digit = multiplyString.charAt(i) - '0';
			digitCount[digit]++;
		}

		for(int n : digitCount) {
			System.out.println(n);
		}
	}
}