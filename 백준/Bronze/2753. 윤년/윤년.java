import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        sc.close();

        boolean leapYear = false;

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            leapYear = true;
        }
        System.out.println(leapYear == false ? "0" : "1");
	}
}