import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Double> grade = new HashMap<>();
		grade.put("A+", 4.3);
		grade.put("A0", 4.0);
		grade.put("A-", 3.7);
		grade.put("B+", 3.3);
		grade.put("B0", 3.0);
		grade.put("B-", 2.7);
		grade.put("C+", 2.3);
		grade.put("C0", 2.0);
		grade.put("C-", 1.7);
		grade.put("D+", 1.3);
		grade.put("D0", 1.0);
		grade.put("D-", 0.7);
		grade.put("F", 0.0);

		System.out.println(grade.get(sc.next()));

		sc.close();
	}
}