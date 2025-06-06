import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		name += "??!";
		System.out.println(name);
		sc.close();
	}
}