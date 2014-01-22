package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class IsFibo {
	public static void main(String[] args) {
		int T;
		long N;
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String isFibo="IsFibo";
		String isNotFibo="IsNotFibo";
		String input;
		HashSet<Long> set=new HashSet<Long>();
		long low=0;
		long high=1;
		set.add(low);
		set.add(high);
		while (high<10000000000L ) {
			long prev=high;
			high=high+low;
			set.add(high);
			low=prev;
		}

		try {
			input = br.readLine();
			T=Integer.parseInt(input);

			while (T-->0) {
				input=br.readLine();
				N=Long.parseLong(input);

				if(set.contains(N))
				{
					System.out.println(isFibo);
				}else {
					System.out.println(isNotFibo);
				}
			}
		}catch (Exception e) {

		}
	}
}
