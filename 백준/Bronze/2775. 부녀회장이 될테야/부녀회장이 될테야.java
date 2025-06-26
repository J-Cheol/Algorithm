import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			int[][] dp = new int[k + 1][n + 1];

			for (int j = 1; j <= n; j++) {
				dp[0][j] = j;
			}

			for (int floor = 1; floor <= k; floor++) {
				for (int room = 1; room <= n; room++) {
					for (int l = 1; l <= room; l++) {
						dp[floor][room] += dp[floor - 1][l];
					}
				}
			}
			System.out.println(dp[k][n]);
		}
		sc.close();
	}
}