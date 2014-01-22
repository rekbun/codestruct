package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NChooseK {

	public static void main(String[] args) {
		int T;

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			input = br.readLine();
			T = Integer.parseInt(input);

			while (T-- > 0) {
				long m, n;
				input = br.readLine();
				String[] inputStrings = input.split(" ");
				m = Long.parseLong(inputStrings[0]);
				n = Long.parseLong(inputStrings[1]);
				System.out.println(calculateNChooseK(m + n - 2, n - 1));
			}
		} catch (Exception e) {

		}
	}

	public static long calculateNChooseK(long n, long k) {
		int p = 1000000007;
		return combinations(n, k, p);
	}

	static int get_degree(long n, long p) { // returns the degree with which p is in n!
		int degree_num = 0;
		long u = p;
		long temp = n;
		while (u <= temp) {
			degree_num += temp / u;
			u *= p;
		}
		return degree_num;
	}

	public static long combinations(long n, long k, long p) {
		int num_degree = get_degree(n, p) - get_degree(n - k, p);
		int den_degree = get_degree(k, p);
		if (num_degree > den_degree) {
			return 0;
		}
		long res = 1;
		for (long i = n; i > n - k; --i) {
			long ti = i;
			while (ti % p == 0) {
				ti /= p;
			}
			res = (res * ti) % p;
		}
		long denom = 1;
		for (long i = 1; i <= k; ++i) {
			long ti = i;
			while(ti % p == 0) {
				ti /= p;
			}
			denom = (denom * ti)%p;
		}
		res = (res * degree(denom, p-2, p)) % p;
		return res;
	}

	static long degree(long a, long k, long p) {
		long res = 1;
		long cur = a;

		while (k > 0) {
			if (k % 2 == 1) {
				res = (res * cur) % p;
			}
			k /= 2;
			cur = (cur * cur) % p;
		}
		return res;
	}
}
