import java.util.Scanner;
import java.util.HashSet;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			a %= 42;
			hashSet.add(a);
		}
		System.out.println(hashSet.size());
	}
}