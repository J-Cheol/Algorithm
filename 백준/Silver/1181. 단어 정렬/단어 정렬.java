import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length() - s2.length();
			}
		});

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < N; i++) {
			linkedHashSet.add(arr[i]);
		}

		for (String s : linkedHashSet) {
			System.out.println(s);
		}

	}
}