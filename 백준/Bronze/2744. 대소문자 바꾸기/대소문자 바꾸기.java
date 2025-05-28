import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String word = "";
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				word += Character.toUpperCase(ch);
			} else {
				word += Character.toLowerCase(ch);
			}
		}
		System.out.println(word);

		sc.close();
	}
}