import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int answerCount = 0;
            int sum = 0;
            for(int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == 'O') {
                    answerCount++;
                    sum += answerCount;

                } else if(line.charAt(j) == 'X') {
                    answerCount = 0;
                }
            }
            sb.append(sum + "\n");
        }

        System.out.println(sb.toString());
	}
}