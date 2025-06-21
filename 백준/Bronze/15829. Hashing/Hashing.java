import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        long r = 31;
        long M = 1234567891;
        long hash = 0;
        long pow = 1;
        for (int i = 0; i < L; i++) {
            int num = str.charAt(i) - 'a' + 1;
            hash = (hash + num * pow) % M;
            pow = (pow * r) % M;
        }

        System.out.println(hash);

        sc.close();
	}
}